public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multyply(int a,int b){
        return a*b;
    }
    public int divide(int a, int b){
        if (a==0 ||b==0){
            return 0;
        }
        return a/b;
    }

    public int modulus(int a,int b){
        return a%b;
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Modulus" + calculator.modulus(10,5));
        System.out.println("Multiply" + calculator.multyply(10,5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        if (calculator.divide(0,5)==0){
            System.out.println("Error");
        }
        System.out.println("Arrel Quadrada: " + calculator.sqrt(10));
    }
}
