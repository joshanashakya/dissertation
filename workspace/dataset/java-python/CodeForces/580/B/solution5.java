import java.util.Arrays;import java.util.Comparator;import java.util.Scanner; public class Solution {    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        long[][] friends = new long[input.nextInt()][2];        int differenceAllowed = input.nextInt();         for (int index = 0; index < friends.length; index++) {            friends[index] = new long[] {input.nextLong(), input.nextLong()};        }         Arrays.sort(friends, Comparator.comparingLong(array -> array[0]));         int leftIndex = 0;        int rightIndex = 0;        long sum = 0L;        long friendshipFactor = 0L;         while (rightIndex < friends.length) {            long difference = friends[rightIndex][0] - friends[leftIndex][0];            sum += friends[rightIndex][1];             while (difference >= differenceAllowed && leftIndex <= rightIndex) {                sum -= friends[leftIndex++][1];                difference = friends[rightIndex][0] - friends[leftIndex][0];            }             rightIndex++;            friendshipFactor = Math.max(friendshipFactor, sum);        }         System.out.println(friendshipFactor);    }}
