import java.util.*; public class Main {     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        long d1 = scanner.nextLong(), d2 = scanner.nextLong(), d3 = scanner.nextLong();        long path1 = 2 * d1 + 2 * d2,                path2 = 2 * d1 + 2 * d3,                path3 = 2 * d2 + 2 * d3,                path4 = d1 + d2 + d3;        System.out.println(Math.min(Math.min(path1, path2), Math.min(path3, path4)));    }}
