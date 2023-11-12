class Remove_Duplicates{
    public static void main(String[] args){
        int idx=0;
        String str="saahhilll";
        removeDuplicates(str,idx,new boolean[26], new StringBuilder(""));
    }
    public static void removeDuplicates(String str, int idx, boolean[] map, StringBuilder sb){
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
       
        char currentchar=str.charAt(idx);
        if(map[currentchar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, map, sb);
        }
        else{
            map[currentchar-'a']=true;
            removeDuplicates(str, idx+1,map,sb.append(currentchar));
        }
    }
}
