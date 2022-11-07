
// program to calculate given number is odd or even :

public class pro17 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        int n = 11;
        int out = n % 10;

        if (out == 2 || out == 4 || out == 6 || out == 8 || out == 0){
            System.out.println("given number is even number : ");
        }
        else {
            System.out.println("given number is odd number : ");
        }

    }
}
