import java.util.*;
class RelativeRanks{
    public static String[] findRelativeRanks(int[] score) {
        String[] str=new String[score.length];
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,String> map=new HashMap<>();
        for(int i:score){
            list.add(i);
        }
        Collections.sort(list);
        int len=list.size();
        for(int i=len-1;i>=0;i--){
            if(i==len-1){
                map.put(list.get(i),"Gold Medal");
            }
            else if(i==len-2){
                map.put(list.get(i),"Silver Medal");
            }
            else if(i==len-3){
                map.put(list.get(i),"Bronze Medal");
            }
            else{
                map.put(list.get(i),Integer.toString(len-i));
            }
        }

        for(int i=0;i<score.length;i++){
            str[i]=map.get(score[i]);
        }
        return str;
    }

    public static void main(String[] args){
        int[] score = {5,4,3,2,1};
        String[] res=findRelativeRanks(score);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + ",");
        }
    }
}