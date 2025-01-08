public class Class2{
    public static double add(double a,double b){
        return a+b;
    }
    public static double sub(double a,double b){
        return a-b;
    }
    public static double mul(double a,double b){
        return a*b;
    }
    public static void main(String [] args){
        double a=10;
        double b=3;
        System.out.println(add(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
    }
}