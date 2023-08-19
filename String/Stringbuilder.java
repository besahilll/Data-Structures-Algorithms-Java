class Stringbuilder{
    public static void main(String args[]){
        Stringbuilder sb=new Stringbuilder("Sahil");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        }
        //O(n)
        System.out.println(sb);
    }

}
