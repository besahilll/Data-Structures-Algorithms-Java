/*
problem for a given string convert each the first letter of eachword to uppercase.
*/
class Uppercase{

    public static String toUppercase(String str){
        StringBuilder sb=new StringBuilder("");   //stringbuilder declaration
        char ch= Character.toUpperCase(str.charAt(0));   //convert lowercase to uppercase
        sb.append(ch);     //append the character at end of string
        for(int i=1; i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));   //appending the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str="i am sahil, btech student at UPES";   //sample input
        System.out.println(toUppercase(str));
            
    }
}
