import java.util.Arrays;import java.util.Scanner; public class PashmakAndFlowers {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = Integer.parseInt(scanner.nextLine());        String[] beauty = scanner.nextLine().split(" ");        int[] bs = Arrays.stream(beauty).mapToInt(Integer::parseInt).sorted().toArray();        long min = 0, max = 0;        for (int i : bs) {            if (i == bs[0]) min++;            if (i == bs[n - 1]) max++;        }        if (bs[0] != bs[n - 1]) {            System.out.println((bs[n - 1] - bs[0]) + " " + (max * min));        } else {            System.out.println("0 " + (max * (max - 1L)) / 2L);        }    }}