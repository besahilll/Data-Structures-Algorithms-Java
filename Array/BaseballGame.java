import java.util.*;
class BaseballGame {
    public static int calPoints(String[] ops) {
        List<Integer> list=new ArrayList<>();
        int res=0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            }else if(ops[i].equals("D")){
                list.add(list.get(list.size()-1)*2);
            }else if(ops[i].equals("C")){
                list.remove(list.size()-1);
            }else{
                list.add(Integer.valueOf(ops[i]));
            }
        }
        for(int i=0;i<list.size();i++){
            res+=list.get(i);
        }
        return res;
    }

    public static void main(String[] args){
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));

    }
}
