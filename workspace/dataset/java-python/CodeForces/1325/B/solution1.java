import java.util.HashSet;import java.util.Scanner; public class CopyCopyCopyCopyCopy {     public static void main(String[] args) {        Scanner s = new Scanner(System.in);        int test = s.nextInt();        for (int x = 0; x < test; x++) {            int a = s.nextInt();            HashSet<Integer> set = new HashSet<Integer>();            for (int i = 0; i < a; i++) {                set.add(s.nextInt());            }            System.out.println(set.size());        }    }}
