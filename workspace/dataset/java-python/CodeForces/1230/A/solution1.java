import java.util.Scanner; public class A1230 {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int a1 = scanner.nextInt(), a2 = scanner.nextInt(),                a3 = scanner.nextInt(), a4 = scanner.nextInt(), max, min, other, other2;        max = Math.max(a1, Math.max(a2, Math.max(a3, a4)));        min = Math.min(a1, Math.min(a2, Math.min(a3, a4)));        other = a1 + a2 + a3 + a4 - max - min;        other2 = a1 + a2 + a3 + a4 - max;        if (other == (max + min)) {            System.out.println("YES");        } else if (max == other2) {            System.out.println("YES");        } else System.out.println("NO");    }}
