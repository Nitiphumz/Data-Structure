import java.util.*;

public class Lab4Task3 {
    public static void main(String[] args) {

        //int data[] = { 4, 2, 3, 9, 8, 1, 0, 5 };
        int data[]= getData(8);
        int out[] = insertSort(data);
        Lab4Task1.printArray(out);
    }

    public static int[] insertSort(int[] d) {
        for (int j = 1; j < d.length; j++) {

            int key = d[j];
            int i = j - 1;
            while ((i > -1) && (d[i] > key)) {

                d[i + 1] = d[i];
                i--;

            }
            d[i + 1] = key;
            System.out.print(j+" : ");
            Lab4Task1.printArray(d);
        }
        return d;
    }

    public static int[] getData(int n) {
        int[] ans = new int[n];
        Scanner in = new Scanner(System.in); 
        for (int i = 0; i < ans.length; i++) {
            ans[i] = in.nextInt();
        }
        return ans;
    }
}// class