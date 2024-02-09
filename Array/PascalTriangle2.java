import java.util.*;
class PascalTriangle2{
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mainlist=new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        if(rowIndex==0){
            return firstRow;
        }
        mainlist.add(firstRow);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prevRow=mainlist.get(i-1);
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            currRow.add(1);
            mainlist.add(currRow);
        }

        return mainlist.get(rowIndex);
    }

    public static void main(String args[]){
        int rowIndex=3;
        System.out.println(rowIndex);
    }
}