import java.util.*;
class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0,j=0;
        while(count< g.length && j< s.length){
            if(s[j]>=g[count]){
                count++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] g={1,2,3};//greed factor
        int[] s={1,1};  //size of the cookie
        System.out.println(findContentChildren(g, s));
    }
}
