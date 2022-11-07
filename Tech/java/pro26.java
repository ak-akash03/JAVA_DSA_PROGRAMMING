public class pro26 {
    public static void main(String[] args) {
        System.out.println("Hello akash : ");
        int nums[] = {1,2,3,4,5,4};
        int l = nums.length;
        int m = 0;
        for (int i = 0; i < l; i++) {
            m = i;
            m++;
            for (int j = m; j < l; j++) {
                if (nums[i] == nums[j]){
                    System.out.println(nums[i]);
                    break;
                }
            }
        }
    }
}

