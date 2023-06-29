/*6. 3-ի կամ 5-ի բազմապատիկները:
Օգտատիրոջից վերցրեք մի թիվ, այնուհետև հաշվարկեք այդ թվից ցածր բոլոր բնական թվերի գումարը, որոնք բաժանվում են 3-ի կամ 5-ի: */

public class Multiple {

  // Find the sum of multiples of 'multiple' up to the 'limit'
  static int sumOfMultiples(int multiple, int limit) {
    while (limit % multiple != 0) {
      limit--;
    }

    int count = limit / multiple;

    // Calculate the sum of multiples using the arithmetic series formula
    return ((multiple + limit) * count) / 2;
  }

  static int findSum(int limit) {
    // Find the sum of multiples of 3, 5, and subtract the sum of multiples of 15
    return (
      sumOfMultiples(3, limit) +
      sumOfMultiples(5, limit) -
      sumOfMultiples(15, limit)
    );
  }

  /*If the limit is large, the loop may take a significant amount of time to complete.
   The previous code utilizing the arithmetic series formula is more efficient for large limits.
  */
  static int findSumWithLoop(int limit) {
    int result = 0;
    int i = 1;
    while (i <= limit) {
      if (i % 3 == 0 || i % 5 == 0) {
        result += i;
      }

      i++;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(findSum(10));
    System.out.println(findSumWithLoop(10));
  }
}
