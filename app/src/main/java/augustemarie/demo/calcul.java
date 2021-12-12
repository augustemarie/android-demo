package augustemarie.demo;

public class calcul {
    private double result = 0;
    public calcul effacer(){
        this.result = 0;
        return this;
    }
    public calcul addition(double a, double b){
        this.result = this.result + a + b;
        return this;
    }
    public calcul multiplication(double a, double b){
        if(this.result == 0){
            this.result = a * b;
            return this;
        }
        this.result = this.result * a * b;
        return this;
    }
    public calcul division(double a, double b){
        if(this.result == 0 && b != 0){
            this.result = a / b;
            return this;
        }
        if(a != 0 && b != 0){
            this.result = this.result / a / b;
            return this;
        }
        return this;
    }
    public calcul soustration(double a, double b){
        this.result = this.result - a - b;
        return this;
    }
    public calcul reste(double a, double b){
        if(this.result == 0 && b != 0){
            this.result = a % b;
            return this;
        }
        if(a != 0 && b != 0){
            this.result = this.result % a % b;
            return this;
        }
        return this;
    }
    public int toInt(){
        //Premiere methode
        int result = (int) this.result;
        return result;
    }
    public double toDouble(){
        //Premiere methode
        return this.result;
    }
}
