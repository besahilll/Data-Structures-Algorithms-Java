//String compression problem
class String_Compression{

    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");   //Declaration of StringBuilder
        for(int i=0;i<str.length();i++){
            Integer count=1;     //Integer->class,count->object
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            } 
            sb.append(str.charAt(i));    //add char at index i at the end of the string
            if(count>1){
                sb.append(count.toString());
            }
        }
        
        return sb.toString();
    }
    public static void main(String args[]){
        String str="aaabbbcccdd";
        System.out.println("So the compressed String is:"+compress(str));
    }
}
