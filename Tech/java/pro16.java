
// reverse number program :

public class pro16 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        int n = 111234;
        int rev = 1;
        int rem;

        while(n>0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println(rev);

    }
}
