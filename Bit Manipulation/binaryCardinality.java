import java.util.Arrays;
import java.util.Comparator;

public class BinaryCardinality {

    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] res = new Integer[n];

        for (int i = 0; i < n; i++) {
            res[i] = countBit(arr[i]);
        }

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (res[a] != res[b]) {
                    return res[a] - res[b];
                } else {
                    return a - b;
                }
            }
        };

        Arrays.sort(indices, comparator);

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[indices[i]];
        }

        return result;
    }

    private static int countBit(int n) {
        int res = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                res++;
            }
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] sorted = sortByBits(nums);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
