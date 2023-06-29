import java.util.Scanner;

/* 1.Հաշվիչ.
Ստեղծեք պարզ հաշվիչ ծրագիր, որը օգտվողից խնդրում է գործողություն (+, -, *, կամ /) և երկու floating point թվեր: 
Կատարեք հաշվարկը ընտրված գործողության հիման վրա և հստակ ցուցադրեք արդյունքը: */

public class Counter {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Choose operation: +  -  *  /");
        char operation = myObj.next().charAt(0);
        System.out.println("Input first operand: ");
        float op1 = myObj.nextFloat();
        System.out.println("Input second operand: ");
        float op2 = myObj.nextFloat();
        myObj.close();
        
        switch (operation) {
            case '+':
                System.out.println("Result of sum: " + (op1 + op2));
                break;
            case '-':
                System.out.println("Result of subtraction: " + (op1 - op2));
                break;
            case '*':
                System.out.println("Result of multiplication: " + (op1 * op2));
                break;
            case '/':
                if (op2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result of division: " + (op1 / op2));
                }
                break;
            default:
                System.out.println("Invalid operation! Please choose one of the following: + - * /");
        }
    }
}
