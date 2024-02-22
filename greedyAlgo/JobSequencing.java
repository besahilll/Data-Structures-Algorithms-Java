import java.util.*;
class JobSequencing{
    public static void main(String[] args){
        int[][] jobs={{4,20},{1,10},{1,40},{1,30}};
        Arrays.sort(jobs,Comparator.comparingDouble(o->o[1]));
        List<Integer> list=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.length;i++){
            if(jobs[i][0]>time){
                time++;
            }
        }
        System.out.println(time);
    }
}