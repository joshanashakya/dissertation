import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if (v <= m) b.add(v);
            else a.add(v);
        }

        Collections.sort(a);
        Collections.sort(b);

        long[] apref = new long[a.size()+1];
        long[] bpref = new long[n+1];

        for (int i = 1; i <= n; i++) {
            if (i <= a.size()) {
                apref[i] = apref[i-1]+a.get(a.size()-i);
            }
            if (i <= b.size()) {
                bpref[i] = bpref[i-1]+b.get(b.size()-i);
            } else bpref[i] = bpref[i-1];
        }

        if (a.size() == 0) System.out.println(bpref[n]);
        else {
            long ans = 0;
            for (int ai = 1; ai <= a.size() && (ai-1)*(d+1)+1 <= n; ai++) {
                ans = Math.max(ans, apref[ai]+bpref[n-(ai-1)*(d+1)-1]);
            }
            System.out.println(ans);
        }

        in.close();
    }
}
