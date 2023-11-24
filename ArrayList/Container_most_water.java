import java.util.*;

class Container_most_water{

    public static void storeWater(ArrayList<Integer> height){
        int maxwater=0;
        //brute force
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int wt=j-i;
                int currwater=ht*wt;
                maxwater=Math.max(maxwater,currwater);
            }
        }
        System.out.println("Maximum water contained by container is: " + maxwater);
        
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        storeWater(height);
    }
}
