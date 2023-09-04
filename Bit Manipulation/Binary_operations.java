class Binary_operations{
    public static void AND(int n, int m){  //AND operation
         System.out.println(n & m);
    }

    public static void OR(int n, int m){  //OR operation
        System.out.println(n | m);
    }

    public static void XOR(int n, int m){  //XOR operation
        System.out.println(n ^ m);
    }

    public static void onecomplement(int n){   //1's complement
         System.out.println(~n);
    }

    public static void left_shift(int n){  //left shift operation
        System.out.println(n<<2);
    }
    public static void right_shift(int n){   //right shift operation
         System.out.println(n>>2);
    }
    public static void main(String args[]){ 
        int n=5,m=6;
        AND(n,m);
        OR(n,m);
        XOR(n,m);
        onecomplement(n);
        left_shift(n);
        right_shift(n);
    }
}
