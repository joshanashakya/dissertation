import java.util.Arrays;import java.util.Comparator;import java.util.Scanner; public class FriendsParty {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();        int d = scanner.nextInt();         Integer[][] friend = new Integer[n][2];         for (int i = 0; i < n; i++) {            friend[i][0] = scanner.nextInt();            friend[i][1] = scanner.nextInt();        }         Arrays.sort(friend, Comparator.comparingInt(o -> o[0]));         long max = friend[0][1];        long currMax = friend[0][1];        int last = 0;        for (int i = 1; i < n; i++) {            if(friend[i][0] - friend[last][0] < d) {                currMax += friend[i][1];            } else {                currMax -= friend[last][1];                last++;                i--;            }             if(currMax > max) max = currMax;        }         System.out.println(max);    }}
