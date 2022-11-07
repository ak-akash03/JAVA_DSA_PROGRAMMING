class pro23{
    public static void main(String args[]){

        System.out.println("Hello akash : ");

        int n = args[0].charAt(0);


        if (n=='1' || n=='2' || n=='3' || n=='4' || n=='5' || n=='6' || n=='7' || n=='8' || n=='9' || n=='0'){

            int m = Integer.parseInt(args[0],10);
            System.out.println(n + " : This is the Number");

        }
        else{

            System.out.println("This is the Character and there ASCII Value is : " + n);

        }
    }
}