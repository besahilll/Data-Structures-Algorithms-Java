import java.util.*;
class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainlist=new ArrayList<>();
        if(numRows==0){
            return mainlist;
        }
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        mainlist.add(firstRow);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=mainlist.get(i-1);
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            currRow.add(1);
            mainlist.add(currRow);
        }
        return mainlist;
    }

    public static void main(String[] args){
        int numRows=5;
        System.out.println(generate(numRows));
    }
}