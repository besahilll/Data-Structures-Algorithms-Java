//If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
    static boolean flag=true;
    static int B,H;
static{
        Scanner sc=new Scanner(System.in);
        B= sc.nextInt();
        H= sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
}

