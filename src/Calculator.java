public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }



    public int divide(int a, int b){
        if (a==0 ||b==0){
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multyply: " + calculator.multiply(10, 5));
        System.out.println("Divide: " + calculator.divide(10, 5));
        if (calculator.divide(0,5)==0){
            System.out.println("Error");
        }
    }
}
