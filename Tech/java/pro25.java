public class pro25 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");

        for (int j = 0; j < args.length; j++) {
            String str = args[j];
            int m = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = args[j].charAt(i);
                if(c>=48 && c<=56){
                    m++;
                }
            }

            System.out.println(m==str.length() ? "Numeric : " : "Not a Numeric : ");
        }
    }
}
