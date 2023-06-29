/*9. Ձայնավորների հաշվիչ.
Գրի՛ր ծրագիր, որը հաշվում է տվյալ տողի ձայնավորների թիվը: 
Հորդորեք օգտվողին մուտքագրել տող, անցեք տողի վրայով և հաշվել ձայնավորները (Ձայնավորները ներառում են «a», «e», «i», «o» և «u» և փոքրատառ, և մեծատառ): 
Վերջապես վերադարձրեք և ցուցադրեք ձայնավորների թիվը համապատասխան հաղորդագրությամբ։  */

import java.util.Scanner;

public class VowelCounter {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Input text: ");
    String text = myObj.next();
    myObj.close();

    System.out.println(vowelCount(text));
  }

  static int vowelCount(String text) {
    int count = 0;
    for (char c : text.toCharArray()) {
      if (isVowel(c)) {
        count++;
      }
    }
    return count;
  }

  static boolean isVowel(char c) {

    c = Character.toLowerCase(c);

    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }
}
