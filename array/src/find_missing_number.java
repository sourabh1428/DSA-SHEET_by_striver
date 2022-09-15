import java.util.HashSet;
import java.util.Iterator;

public class find_missing_number {
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 14, 14, 15, 16};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        Iterator it = set.iterator();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

    }
}
