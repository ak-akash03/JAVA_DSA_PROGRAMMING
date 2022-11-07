//  Reverse The Array :
public class pro37 {
    public static void reveseTheArray(int[] arr){
         int first = 0 ;
         int temp;
         int last = arr.length-1;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        System.out.println("hello akash : - )");
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        reveseTheArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
