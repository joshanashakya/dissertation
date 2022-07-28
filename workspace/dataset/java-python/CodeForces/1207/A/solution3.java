import java.math.BigInteger;import java.util.Scanner; public class Main {     public static Scanner scanner = new Scanner(System.in);     public static void main(String[] args) {        int t = scanner.nextInt();        for (int i = 0; i < t; i++) {            int b = scanner.nextInt();            int p = scanner.nextInt();            int f = scanner.nextInt();            int h = scanner.nextInt();            int c = scanner.nextInt();            int numberOfBurgers = b / 2;             if (p + f < numberOfBurgers) {                System.out.println(f * c + p * h);                continue;            }             if (h > c) {                if (numberOfBurgers <= p) {                    System.out.println(numberOfBurgers * h);                } else {                    System.out.println(p * h + Math.abs(numberOfBurgers - p) * c);                }            } else {                if (numberOfBurgers <= f) {                    System.out.println(numberOfBurgers * c);                } else {                    System.out.println(f * c + Math.abs(numberOfBurgers - f) * h);                }            }        }    }     public static boolean isSorted(int[] array) {        for (int i = 0; i < array.length - 1; i++) {            if (array[i] > array[i + 1]) {                return false;            }        }        return true;    }     public static boolean isSortedReverse(int[] array) {        for (int i = 0; i < array.length - 1; i++) {            if (array[i] < array[i + 1]) {                return false;            }        }        return true;    }     public static BigInteger printFibonacciWithoutArrays(int n) {        if (n == 0) {            return BigInteger.ZERO;        }        if (n == 1) {            return BigInteger.ONE;        }        BigInteger prevOfPrev = BigInteger.ZERO;        BigInteger prev = BigInteger.ONE;        BigInteger now = BigInteger.ZERO;        for (int i = 2; i <= n; i++) {            now = prevOfPrev.add(prev);            prevOfPrev = prev;            prev = now;        }        return now;    }     public static int[] mergeArrays(int[] a1, int[] a2) {        if (a1.length == 0 && a2.length == 0) {            return new int[]{};        }        if (a1.length == 0) {            return a2;        }        if (a2.length == 0) {            return a1;        }         int[] array = new int[a1.length + a2.length];        int t1 = 0;        int t2 = 0;        for (int i = 0; i < array.length; i++) {            if (a1.length <= t1) {                array[i] = a2[t2++];                continue;            }            if (a2.length <= t2) {                array[i] = a1[t1++];                continue;            }             if (a1[t1] >= a2[t2]) {                array[i] = a2[t2++];            } else {                array[i] = a1[t1++];            }        }        return array;    }     public static BigInteger factorial(int value) {        BigInteger bigInteger = new BigInteger(String.valueOf(1));        for (int i = 2; i <= value; i++) {            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));        }        return bigInteger;    }     public static void checkPalindrome(String s) {        StringBuilder str = new StringBuilder();        for (int i = 0; i < s.length(); i++) {            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {                str.append(Character.toLowerCase(s.charAt(i)));            }        }        for (int i = 0; i < str.length() / 2; i++) {            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {                System.out.println("no");                return;            }        }        System.out.println("yes");    }     public static void checkSortArrayLength(int[] array) {        int cnt = 1;        int max = 1;        for (int i = 0; i < array.length - 1; i++) {            if (array[i + 1] >= array[i]) {                cnt++;            } else {                cnt = 0;            }            if (cnt > max) {                max = cnt;            }        }        System.out.println(max);    }     public static boolean isPowerOfTwo(long value) {        if (value <= 0) {            return false;        }        return (value & (value) - 1) == 0;    }     public static boolean isPrime(int k) {        if (k % 2 == 0) {            return false;        }        for (int i = 3; i <= Math.sqrt(k); i += 2) {            if (k % i == 0) {                return false;            }        }        return true;    }     public static int fact(int a) {        int s = 1;        for (int i = 2; i <= a; i++) {            s *= i;        }        return s;    }     public static void selectionSort(int[] arr) {        for (int i = 0; i < arr.length - 1; i++) {            int index = i;            for (int j = i + 1; j < arr.length; j++) {                if (arr[j] < arr[index]) {                    index = j;                }            }            swap(arr, index, i);        }    }     public static void swap(int[] array, int i, int j) {        int temp = array[i];        array[i] = array[j];        array[j] = temp;    }     public static void swap(int[][] array, int i, int j) {        int[] temp = array[i];        array[i] = array[j];        array[j] = temp;    }     public static int binarySearchWithRec(int[] array, int key, int begin, int end) {        int mid = begin + (end - begin) / 2;        if (array[mid] == key) {            return mid;        }        if (begin == end) {            return -1;        }        if (array[mid] > key) {            return binarySearchWithRec(array, key, begin, mid);        }        if (array[mid] < key) {            return binarySearchWithRec(array, key, mid + 1, end);        }        return -1;    }}
