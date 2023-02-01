package BDDCalculationTest;

public class Calculator {
    protected int x, y;

    public int Sum(int x, int y){
        return x+y;
    }
    public int Sum(){
        return x+y;
    }
    public int Subtract(){
        return x-y;
    }
    public int Multiple(int x, int y){
        return x *y;
    }
    public int Divide(int x, int y){
        return x/y;
    }
    public void setFirstNumber(int x){
        this.x = x;
    }
    public int getFirstNumber(){
        return  x;
    }
    public void setSecondNumber(int y){
        this.y = y;

    }
    public int getSecondNumber(){
        return  x;
    }

}
