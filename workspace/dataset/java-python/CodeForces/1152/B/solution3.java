//package albert.codeforces.nekoperformscatfurriertransform1152b; import java.util.ArrayList;import java.util.List;import java.util.Scanner;import java.util.stream.Collectors; public class Solution {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int x = in.nextInt();        solve(x);    }     private static void solve(int x) {        int op = 0;        int t = 0;        List<Integer> ops = new ArrayList<>();        int pos;        while ((pos = zeroPos(x)) >= 0) {            x = apply(x, op, pos, ops);            op = (op + 1) % 2;            t++;        }        System.out.println(t);        System.out.println(ops.stream().map(String::valueOf).collect(Collectors.joining(" ")));    }     private static int zeroPos(int x) {        int bits = 0;        int xx = x;        while (xx > 0) {            xx = xx >> 1;            bits++;        }        for (int i = bits - 2; i >= 0; i--) {            if ((x & (1 << i)) == 0) {                return i;            }        }        return -1;    }     private static int apply(int x, int op, int zeroPos, List<Integer> ops) {        if (op == 1) {            return ++x;        }        int oprnd = (1 << (zeroPos + 1)) - 1;        ops.add(zeroPos + 1);        return x ^ oprnd;    }}