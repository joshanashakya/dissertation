import java.util.*; public class N {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int n = in.nextInt();        int[] toffee = new int[n + 10];        in.nextLine();        String array = in.nextLine();        for (int i = 0; i < n - 1; i++) {            int a = i + 1, b = i + 2;            if (toffee[a] == 0) toffee[a]++;            if (toffee[b] == 0) toffee[b]++;             if (array.charAt(i) == 'L') {                while (toffee[a] <= toffee[b])                    toffee[a]++;                int pre = a - 1, now = a, id = i - 1;                for (int j = pre; j >= 1; j--) {                    if (array.charAt(id) == 'L') {                        while (toffee[pre] <= toffee[now])                            toffee[pre]++;                    } else if (array.charAt(id) == '=') {                        while (toffee[pre] < toffee[now])                            toffee[pre]++;                    } else break;                    id--;                    now = pre;                    pre--;                }            } else if (array.charAt(i) == 'R') {                while (toffee[b] <= toffee[a])                    toffee[b]++;            } else if (array.charAt(i) == '=') {                if (toffee[a] < toffee[b]) {                    while (toffee[a] < toffee[b])                        toffee[a]++;                    int pre = a - 1, now = a, id = i - 1;                    for (int j = pre; j >= 1; j--) {                        if (array.charAt(id) == 'L') {                            while (toffee[pre] <= toffee[now])                                toffee[pre]++;                        } else if (array.charAt(id) == '=') {                            while (toffee[pre] < toffee[now])                                toffee[pre]++;                        } else break;                        id--;                        now = pre;                        pre--;                    }                } else if (toffee[b] < toffee[a]) {                    while (toffee[b] < toffee[a])                        toffee[b]++;                }            }        }         for (int i = 1; i <= n; i++) {            System.out.print(toffee[i] + " ");        }    }}
