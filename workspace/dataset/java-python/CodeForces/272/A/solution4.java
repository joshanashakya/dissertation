import java.util.Scanner; public class Problem_272A {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        int friends = s.nextInt();        int fingerSum = 0;        for(int i = 0; i < friends; i++)            fingerSum += s.nextInt();         int ways = 0;        for(int i = 1; i <= 5; i++) {            if((fingerSum + i) % (friends + 1) != 1) {                ways++;            }        }         System.out.println(ways);     }}
