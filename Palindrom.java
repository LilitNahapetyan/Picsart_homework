/*8. Պալինդրոմ.
Գրեք ծրագիր, որը ստուգում է, թե արդյոք տվյալ տողը պալինդրոմ է: 
Օգտվողից վերցրեք նախադասություն, վերլուծեք մուտքագրումը և որոշել, թե արդյոք այն նույնն է կարդում սկզբից և վերջից: 
Ցուցադրել համապատասխան հաղորդագրություն՝ նշելով, թե արդյոք նախադասությունը պալինդրոմ է, թե ոչ: */
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = myObj.next();
        myObj.close();

        System.out.println(palindrome(text) ? "Text is a palindrome" : "Text is not a palindrome");
    }

    static boolean palindrome(String text) {
        if (text.length() < 2) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

        return palindrome(text.substring(1, text.length() - 1));
    }
}
