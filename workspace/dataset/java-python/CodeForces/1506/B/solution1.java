import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int partialReplace(char[] arr, int length, int distance) {
        int count = 0;
        
        List<Integer> idx = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            if (arr[i] == '*') {
                idx.add(i);
            }
        }

        if (idx.size() <= 2) {
            return idx.size();
        }

        int i = 0;
        count = 1;

        while (i < idx.size() - 1) {
            int cover = idx.get(i) + distance;
            while ((i < idx.size()) && (idx.get(i) <= cover)){
                i++;
            }

            i--;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int testcase = in.nextInt();

        while (testcase > 0) {
            int length = in.nextInt();
            int distance = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            char[] str = in.nextLine().toCharArray();

            int result = partialReplace(str, length, distance);

            System.out.println(String.valueOf(result));

            testcase--;
        }

        in.close();
    }
}
