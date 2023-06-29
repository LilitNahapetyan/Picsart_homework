/*5. Թվերի զանգվածի միջին թվաբանականը.
Կառուցեք ծրագիր, որը հաշվարկում է թվերի զանգվածի միջին թվաբանականը։ 
Վերցրեք թվերի զանգված, հաշվարկեք զանգվածի էլեմենտների միջին թվաբանականը՝ գումարելով և բաժանելով ընդհանուր թվի վրա և ցուցադրեք միջին արժեքը համապատասխան հաղորդագրությամբ: */

public class ArithmeticAverage {
    static float arithmeticAverage(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        float result = 0f;
        for(int i: arr){
            result += i;
        }
        return result / arr.length;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,-2,5,7,0};
        System.out.println("Arithmetic average of that numbers is " + arithmeticAverage(array));
    }
}
