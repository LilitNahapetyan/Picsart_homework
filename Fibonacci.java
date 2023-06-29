import java.util.Scanner;
/*2. Ֆիբոնաչի.
Մշակեք ծրագիր, որը ստեղծում է Ֆիբոնաչիի հաջորդականություն՝ օգտատիրոջ տվյալների հիման վրա: 
Օգտագործողից վերցրեք դրական ամբողջ թիվ, այնուհետև ցուցադրեք Ֆիբոնաչիի հաջորդականությունը մինչև այդ թվի դիրքում գտնվող Ֆիբոնաչիի թիվը : 
Ֆիբոնաչիի հաջորդականությունը սկսվում է 0-ով և 1-ով, և յուրաքանչյուր հաջորդ թիվ նախորդ երկու թվերի գումարն է: */


class Fibonacci {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input Integer: ");
        int number = myObj.nextInt();
        myObj.close();

        // Calculate the count of Fibonacci numbers up to a given value using Binet's formula
        double phi = (1 + Math.sqrt(5)) / 2;
        int countOfFibNumbers = (int) Math.floor((Math.log(number * Math.sqrt(5) + 0.5)) / Math.log(phi)) + 1;
    
        int[] fibonacciSequence = new int[countOfFibNumbers];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        //generating the Fibonacci sequence
        for (int i = 2; i < countOfFibNumbers; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        for (int i = 0; i < fibonacciSequence.length; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
