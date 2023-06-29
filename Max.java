/*4. Առավելագույն տարրը զանգվածում.
Ստեղծեք ծրագիր, որը գտնում է առավելագույն թիվը թվերի զանգվածում: 
Վերադարձնել և ցուցադրել առավելագույն թիվը համապատասխան հաղորդագրությամբ: */

class Max{
    static int maxNumber(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numsArr = new int[]{1,-5,6,7,-4,12,7};
        System.out.println("Maximum number of that array is :" + maxNumber(numsArr));
    }
}