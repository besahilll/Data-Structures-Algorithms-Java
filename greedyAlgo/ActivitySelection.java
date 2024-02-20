import java.util.*;
class Activity_Selection{
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={9,4,2,6,9,7};

        //sort 2D array
        int[][] activities=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2])); //lambda function
        int maxAct=0;
        for(int i=0;i<activities.length;i++){
            System.out.println(activities[i][0]);
        }
        List<Integer> ans=new ArrayList<>();
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Maximum activities performed: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print(" A" + ans.get(i));
        }
    }
}