public class Calculator {

    static void calcIFELSE(double paramA, double paramB, char operation){
        if (operation == '+'){
            System.out.println(paramA + paramB);
        }
        if (operation == '-') {
            System.out.println(paramA - paramB);
        }
        if (operation == '/') {
            System.out.println(paramA / paramB);
        }
            if (operation == '*') {
                System.out.println(paramA * paramB);
            }
            else {
                System.out.println("incorrect");
            }
        }
        static void calcSwitch(double paramA, double paramB,char operation){
        double result=0;
        switch (operation){
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            default:
                System.out.println("Incorrect");
        }
        System.out.println("Результат операции " + operation + " = " + result);
    }
    public static void main(String[] args) {
        calcSwitch(5, 5, '+');
        calcSwitch(5, 5, '-');
        calcSwitch(5, 5, '*');
        calcSwitch(5, 5, '/');
    }
}

