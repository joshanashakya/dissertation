import java.util.Scanner; public


class Main {     public static void main(String[] args) throws Exception {String yes = "YES";        String no = "NO";        Scanner sc = new Scanner(System.in );        int t = sc.nextInt();  for (int i = 0; i < t; i++){int n = sc.nextInt();            int[] nums = new int[n];            int max = 0;  for (int j = 0; j < n; j++) {nums[j] = sc.nextInt();  if (j > 0) {max += Math.max(0, nums[j - 1] - nums[j]);}}             System.out.println((max <= nums[0])? yes: no

);}}}
