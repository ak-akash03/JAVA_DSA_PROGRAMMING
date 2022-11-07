public class pro33 {
    public static int findkey(int arr[] , int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        System.out.println("hello akash : ");
        int arr[] = {2,3,4,5,6,7,8,9,0};
        int key = 8;
        System.out.println(findkey(arr,key));


    }
}
