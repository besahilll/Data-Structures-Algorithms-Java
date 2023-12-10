class Calculator{
  public static void main(String args[]){
     System.out.println("Sahil Bathla,500091837");
     Double x= Double.parseDouble(args[0]);
     String op= args[1];
     Double y= Double.parseDouble(args[2]);
     
     
     if(op.equals("+"))
        System.out.println("Sum is:"+(x+y));
     else if(op.equals("-"))
        System.out.println("Sum is:"+(x-y));
     else if(op.equals("x"))
        System.out.println("Sum is:"+(x*y));
     else if(op.equals("/"))
        System.out.println("Sum is:"+(x/y));
     else{
       System.out.println("Enter the appropriate operator");
     }
    
  }
}
     

     
