// Reverse the Array
public class pro34 {
    public static int largest(int[] arr){
        int largeNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largeNumber){
                largeNumber = arr[i];
            }
        }
        return largeNumber;
    }
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        int arr[] = {2,4,66,8,10};
        System.out.println(largest(arr));
    }
}
