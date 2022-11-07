// find the smallest value from the given array :
public class pro35 {
    public static int smallest(int[] arr){
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(small > arr[i]){
                small = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        int arr[] = {11,22,3,4,5,6,7,8,9,10};
        System.out.println(smallest(arr));
    }
}
