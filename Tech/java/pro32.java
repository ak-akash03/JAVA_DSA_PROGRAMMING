public class pro32 {
    public static boolean ispower(int n){
        int m = 2;
        int x = 1;
        if(n == 1){
            return true;
        }
        for (int i = 0; i < 101; i++) {
            x = m * x;
            if(x == n){
                return true;
            }
            if(x > n){
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello akash : - ) ");
        int n = 1;
        System.out.println(ispower(n));
    }
}
