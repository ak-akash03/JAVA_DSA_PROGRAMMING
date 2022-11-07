public class pro18 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 10; j++) {
                if (((i+j) < 6) || ((i+j) > 10)){
                    System.out.print("   ");
                }
                else {
                    if (i+j == 6  ||  i+j == 10  || i==1 || i==5){
                        System.out.print("*  ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
