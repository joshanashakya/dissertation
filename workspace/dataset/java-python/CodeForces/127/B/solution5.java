import java.util.Scanner; public class FrameArtist {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();        int[] a = new int[101];        int count = 0;         for (int i = 0; i < n; i++) {            int add = scanner.nextInt();            a[add]++;             if(a[add] == 4){                count++;                a[add] = 0;            }        }         for (int i = 1; i < 101; i++) {            if(a[i] > 1){                for (int j = i+1; j < 101; j++) {                    if(a[j] > 1){                        count++;                        a[j] = 0;                        break;                    }                }            }        }         System.out.println(count);    }}
