import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner; public


class A1495 {     public static void main(String[] args) {Locale.setDefault(Locale.US);        Scanner in = new Scanner(System.in );        int T = in.nextInt(); for (int t=0; t < T; t++) {int N = in.nextInt();            List < Integer > miners = new ArrayList <> (N);            List < Integer > diamonds = new ArrayList <> (N); for (int n=0; n < 2 * N; n++) {int x = in.nextInt();                int y = in.nextInt(); if (x == 0) {miners.add(Math.abs(y));} else {diamonds.add(Math.abs(x));}}            Collections.sort(miners);            Collections.sort(diamonds);            double answer = 0; for (int n=0; n < N; n++) {int x = diamonds.get(n);                int y = miners.get(n);                answer += Math.sqrt(x * (long)x + y * (long)y);}            System.out.println(answer);}} }
