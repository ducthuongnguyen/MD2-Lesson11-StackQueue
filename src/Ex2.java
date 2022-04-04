import java.util.Map;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<String, Integer>();
        String str = "Nguyen Duc Thuong Thuong thuong";
        String[] arr = str.toUpperCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }

        for (int i = 0; i < arr.length; i++) {

            if (treeMap.containsKey(arr[i])) {
                treeMap.put(arr[i], treeMap.get(arr[i]) + 1);
            } else {
                treeMap.put(arr[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}
