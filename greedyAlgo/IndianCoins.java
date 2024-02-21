/*We are given an infinite supply of denomination [1,2,5,10,20,50,100,500,2000]
find min. no. of coins/notes to make change a value V */
import java.util.*;
class IndianCoins{
    public static void main(String args[]){
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        int V=550;
        List<Integer> list=new ArrayList<>();
        Arrays.sort(coins, Comparator.reverseOrder());
        int count=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=V){
                while(coins[i]<=V){
                    count++;
                    list.add(coins[i]);
                    V=V-coins[i];
                }
            }
        }
        System.out.println(count);
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}