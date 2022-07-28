import java.util.Arrays;import java.util.Scanner; public class n706B {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int n = scanner.nextInt();        int[] price = new int[n];        for (int i = 0; i < n; i++)            price[i] = scanner.nextInt();        Arrays.sort(price);        int q = scanner.nextInt();        long m;        for (int i = 0; i < q; i++) {            m =  scanner.nextLong();            if (m < price[0])                System.out.println(0);            else if (m >= price[n - 1])                System.out.println(n);            else                System.out.println(binarysearch(price, m, 0));        }    }     public static int binarysearch(int[] price, long m, int start) {        int left = start;        int right = price.length - 1;        while (left <= right) {            int mid = (left + right) / 2;            if (price[mid] == m) {                while (mid + 1 < price.length - 1 && price[mid] == price[mid + 1])                    return binarysearch(price, m, mid + 1);                return mid + 1;            }            else if (price[mid] < m)                left = mid + 1;            else                right = mid - 1;        }        while (left < price.length - 1 && price[left - 1] == price[left])            return binarysearch(price, m, left);        return left;    }}
