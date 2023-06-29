/*10. Ամենաերկար բառը.
Մշակեք ծրագիր, որը կգտնի տվյալ նախադասության ամենաերկար բառի երկարությունը: 
Օգտվողը մուտքագրում է նախադասություն, մեթոդով հաշվել ամենաերկար բառի երկարությունը: 
Վերջապես վերադարձրեք և ցուցադրեք ամենաերկար բառի երկարությունը համապատասխան հաղորդագրությամբ: */

import java.util.Scanner;

class LongestWord {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = myObj.nextLine();
        myObj.close();
        System.out.println(longestWord(text));
    }

    static int longestWord(String text) {
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 0;
            }
        }

        return maxLength;
    }
}
