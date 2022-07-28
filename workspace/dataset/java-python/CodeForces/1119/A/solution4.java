import java.io.PrintWriter;import java.util.Scanner; public class ColorfulWalk1100 {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        PrintWriter out = new PrintWriter(System.out);         int houses = in.nextInt();        int[] colors = new int[houses];        for (int i = 0; i < houses; i++)            colors[i] = in.nextInt();        int distanceEnd = 0;        for (int i = 0; i < houses - 1; i++) {            if (colors[i] != colors[houses - 1]) {                distanceEnd = Math.abs((houses - 1) - i);                break;            }        }        int distanceBeg = 0;        for (int i = houses - 1; i > -1; i--) {            if (colors[i] != colors[0]) {                distanceBeg = Math.abs(i);                break;            }        }        out.print(Math.max(distanceBeg, distanceEnd));        out.close();    }}