// Program to write counts of all charactor of a given array :
import java.util.Scanner;
public class pro31 {
    public static int show(String arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Hello Akash : - ) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the string array : ");
        String ak[] = new String[10];
        for(int i = 0 ; i < ak.length ; i++){
            ak[i] = scan.next();
        }
        System.out.println(show(ak));
    }
}
