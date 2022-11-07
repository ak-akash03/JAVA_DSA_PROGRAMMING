public class pro29{
    public static void main(String[] args) {
        System.out.println("hello akash rajendra rathod : ");

        String strs[] = {"flower","flow","flight"};

        for (int i = 0; i < strs.length; i++) {

            for (int j = 0; j < strs[i].length()-2; j++) {

                if(strs[0].charAt(i) == strs[j].charAt(i)){
                    System.out.println(strs[i]);
                }

            }

        }



    }
}
