import java.util.Scanner; public class B1032 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        char[] S = in.next().toCharArray();        int length = S.length;        int rows = (length+19)/20;        int inRow = length/rows;        int remainder = length%rows;        int colums = inRow + ((remainder == 0) ? 0 : 1);        StringBuilder sb = new StringBuilder();        int pos = 0;        for (int row=0; row<rows; row++) {            for (int i=0; i<inRow; i++) {                sb.append(S[pos++]);            }            if (remainder != 0) {                sb.append((row < remainder) ? S[pos++] : '*');            }            sb.append('\n');        }        System.out.println(rows + " " + colums);        System.out.print(sb);    } }
