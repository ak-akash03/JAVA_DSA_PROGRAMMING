
// The fibonacci numbers, commonly denoted f(n) form a sequence , called the fibonacci sequence , such that
// each number is the sum of the two preceding ones, starting from 0 and 1. that is,

public class pro20 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        int n = 30;
        int f1 = 1;
        int f0 = 0;
        int fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = f1 + f0;
            f0 = f1;
            f1 = fn;
        }
        System.out.println(fn);
    }
}




