import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1396 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int t = Integer.parseInt(br.readLine()); t-- > 0; ) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int maxPile = 0;
            int totalStones = 0;
            for (int i = 0; i < n; i++) {
                int pile = Integer.parseInt(st.nextToken());
                totalStones += pile;
                maxPile = Math.max(maxPile, pile);
            }
            if ((maxPile << 1) > totalStones || (totalStones & 1) == 1) {
                System.out.println("T");
            } else {
                System.out.println("HL");
            }
        }
    }
}

