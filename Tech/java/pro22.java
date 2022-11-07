public class pro22 {
    public static void main(String[] args) {
        System.out.println("hello akash : ");
        String str = args[0];
        char c = args[0].charAt(0);

        char a[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                    'n','o','p','q','r','s','t','u','v','w','x','y','z',
                    'A','B','C','D','E','F','G','H','I','J','K','L','M',
                    'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n = a.length-1;
        for (int i = 0; i < a.length; i++) {

            if (c==a[i]){
                System.out.println("it is character : ");
                break;
            }
            else if (a[i] == a[n]) {
                System.out.println("it is number : ");
            }
        }

//        char n = '5';
//        if (n=='1' || n=='2' || n=='3' || n=='4' || n=='5' || n=='6' || n=='7' || n=='8' || n=='9' || n=='0'){
//            System.out.println("hello akash :");
//        }
//        else{
//            System.out.println("hello sagar :");
//        }
    }
}


