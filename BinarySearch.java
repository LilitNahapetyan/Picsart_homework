/*3. Բինար որոնում.
Գրեք ծրագիր, որը կկատարի բինար որոնում ամբողջ թվերի սորտավորված զանգվածի վրա: 
Ֆունկցիան պետք է վերցնի զանգված և փնտրվող տարր որպես մուտքագրում և վերադարձնի փնտրվող տարրի ինդեքսը: 
Եթե փնտրվող տարրը գոյություն չունի, վերադարձրեք -1: */
import java.util.Arrays;

class BinarySearch {
    static int binarySearch(int[] array, int number) {
        int result = -1;
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            int mid = (left + right) / 2;
            
            if (array[mid] == number) {
                result = mid;
                break;
            } else if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 6, 8, 7, 9};//
        Arrays.sort(arr); // Binary search works on sorted arrays
        
        System.out.println(binarySearch(arr, 8));
    }
}
