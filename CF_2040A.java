import java.util.*;

public class CF_2040A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Map<Integer, Integer> modCounts = new HashMap<>();
            Map<Integer, List<Integer>> modIndices = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int mod = a[i] % k;
                modCounts.put(mod, modCounts.getOrDefault(mod, 0) + 1);
                if (!modIndices.containsKey(mod)) {
                    modIndices.put(mod, new ArrayList<>());
                }
                modIndices.get(mod).add(i + 1); // Using 1-based indexing
            }
            boolean found = false;
            for (Map.Entry<Integer, Integer> entry : modCounts.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println("YES");
                    System.out.println(modIndices.get(entry.getKey()).get(0));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}