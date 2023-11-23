import java.util.*;
class Swapping{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        System.out.println(numbers);
        //swap
        int temp=numbers.get(0);
        numbers.set(0,numbers.get(1));
        numbers.set(1,temp);
        System.out.println(numbers);
    }
}
