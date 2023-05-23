import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
       Scanner scanner = new Scanner(System.in);
        int n, m;
        Set<Integer> r = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][m]; // Use dynamic array size
        for (int i = 0; i < n; i++) { // Start indices from 0
            for (int j = 0; j < m; j++) { // Start indices from 0
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 1) {
                    r.add(i);
                    c.add(j);
                }
            }
        }
        int rowCount = n - r.size();
        int colCount = m - c.size();
        int minCount = Math.min(rowCount, colCount);
        if (minCount % 2 == 0)
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }
}