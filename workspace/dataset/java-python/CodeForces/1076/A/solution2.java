import java.util.*; public class eDictonary {        public static void main(String[] args) {                Scanner scan = new Scanner(System.in);                int n = scan.nextInt();        String s = scan.next();        StringBuilder sb = new StringBuilder(s);                int index=0;                for (int i = 0; i < s.length(); i++) {            if(i == s.length()-1) {                sb.deleteCharAt(index);                break;            }            else if (sb.charAt(index) <= sb.charAt(index+1)) {                index++;            }            else {                sb.deleteCharAt(index);                break;            }        }                System.out.println(sb);    }    }