import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class NumberGuessing {    public static void main(String[] args) throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));         int n = Integer.parseInt(reader.readLine());         Integer l = null,u = null;         for (int i = 0; i < n; i++) {            String[] line = reader.readLine().split(" ");            int x = Integer.parseInt(line[1]);             switch (line[0]) {                case ">":                    if (line[2].equals("Y")) {                        if (l == null || l <= x) l = x + 1;                    } else if (u == null || u > x) u = x;                    break;                case "<":                    if (line[2].equals("Y")) {                        if (u == null || u >= x) u = x - 1;                    } else if (l == null || l < x) l = x;                    break;                case ">=":                    if (line[2].equals("Y")) {                        if (l == null || l < x) l = x;                    } else if (u == null || u >= x) u = x - 1;                    break;                default:                    if (line[2].equals("Y")) {                        if (u == null || u > x) u = x;                    } else if (l == null || l <= x) l = x + 1;            }        }         if(l == null) System.out.println(u);        else if(u == null || l <= u) System.out.println(l);        else System.out.println("Impossible");    }}