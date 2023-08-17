class Compare{
public static void main(String args[]){
    String s1="Sahil";
    String s2="Sahil";
    String s3=new String("Sahil");
    
    if(s1==s2){
        System.out.println("Strings are equal");
    }
    if(s1==s3){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal");
    }
    if(s1.equals(s3)){    //equals method
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal");
    }
}
}
