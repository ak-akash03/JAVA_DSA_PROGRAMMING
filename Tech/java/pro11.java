
// if else nested statement :

public class pro11 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        int n = 10;

        if (n > 0){
            if(n%2 == 0){
                System.out.println("n is possitive and even number : ");
            }
            else {
                System.out.println("n is possitive and odd number : ");
            }
        } else if (n == 0) {
            System.out.println("n is Zero : ");
        } else {
            System.out.println("n is negative number : ");
        }

    }
}
