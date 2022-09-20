import java.util.*;
public class QuizSort1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "input: ");
        String[] t = sc.nextLine().split(",");
        int[] n = new int[t.length];
        System.out.print("output: ");
        for (int i = 0; 1 < t.length; i++) {
            n[i] = Integer.parseInt(t[i]);
        }
        Arrays.sort(n);
        System.out.print(n[n.length -1]);
        
    
    }
}

