public class pro19 {
    public static void main(String[] args) {
        System.out.println("hallo akash : ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (i+j < 4){
                    System.out.print("   ");
                }
                else {
                    System.out.print(i + "" + j + " ");
                }
            }
            for (int j = 5; j > 0; j++) {

                if (i+j < 4){
                    System.out.print("   ");
                }
                else {
                    System.out.print(i + "" + j + " ");
                }
            }


            System.out.println();
        }
    }
}
