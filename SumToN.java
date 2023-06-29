/*7. Գումարել մինչեւ N.
Գրի՛ր ծրագիր, որը հաշվարկում է 1-ից մինչև տրված N թիվը դրական ամբողջ թվերի գումարը:
 Օգտագործողից վերցրեք դրական ամբողջ թիվ, հաշվարկեք բոլոր թվերի գումարը 1-ից մինչև այդ թիվը։ Վերադարձրեք և ցուցադրեք ստացված գումարը համապատասխան հաղորդագրությամբ: */

 public class SumToN {
    static int sum(int n){
        return n * (1 + n) / 2; // Formula to calculate the sum of an arithmetic series
    }
    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}