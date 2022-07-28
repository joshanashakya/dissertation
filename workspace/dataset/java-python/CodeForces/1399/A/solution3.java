import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int x = scan.nextInt();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (int i = 0; i < x; i++) {
                int temp = scan.nextInt();
                nums.add(temp);
            }

            if (nums.size() == 1) {
                System.out.println("YES");
                continue;
            }

            Collections.sort(nums);
            for (int i = 0; i < nums.size() - 1; i++) {
                if (nums.get(i + 1) - nums.get(i) <= 1) {
                    nums.remove(i);
                    i--;
                }
            }
            System.out.println (nums.size() == 1 ? "YES" : "NO");
        }
    }
}
