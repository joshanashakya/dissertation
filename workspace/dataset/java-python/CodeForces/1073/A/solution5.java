import java.util.*;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        int n = s.nextInt();        String str = s.next();        for(int i = 1; i < n; i++){            if(str.charAt(i) != str.charAt(i - 1)){                StringBuilder sb = new StringBuilder();                sb.append(str.charAt(i - 1));                sb.append(str.charAt(i));                System.out.println("YES");                System.out.println(sb);                return;            }        }        System.out.println("NO");    }}
