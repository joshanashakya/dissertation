//package B; import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class Codeforces_World_Finals {    static  int n = 3; //   static int[] arr = {1,2,3};    static int[] target = new int[3];    static int[] arr = new int[3];    static int permutations = 0;    private static  void perm(int start) {        for(int i = start;i < n;i++) {            for(int j = i + 1;j < n;j++) {                swap(i,j);                checkP();            //    print();                perm(i + 1);                swap(i,j);                permutations++;            }        }    }    private static void checkP() {        boolean yes = false;        if(arr[1] > 12) {         //   yes = false;        } else if(arr[0] > 31) {      //      yes = false;        }  else if(arr[1] == 1 && arr[0] > 31) {         } else if(arr[2] % 4 != 0 && arr[1] == 2 && arr[0] > 28) {         } else if(arr[1] == 3 && arr[0] > 31) {         } else if(arr[1] == 4 && arr[0] > 30) {         } else if(arr[1] == 5 && arr[0] > 31) {         } else if(arr[1] == 6 && arr[0] > 30) {         } else if(arr[1] == 7 && arr[0] > 31) {         } else if(arr[1] == 8 && arr[0] > 31) {         } else if(arr[1] == 9 && arr[0] > 30) {         } else if(arr[1] == 10 && arr[0] > 31) {         } else if(arr[1] == 11 && arr[0] > 30) {         } else if(arr[1] == 12 && arr[0] > 31) {         } else         if(target[2] - arr[2] > 18) {            yes = true;        } else       if(target[2] - arr[2] == 18 && target[1] > arr[1])  {           yes = true;       } else if(target[2] - arr[2] == 18 && target[1] == arr[1] &&       target[0] > arr[0]) {           yes = true;       } else if(target[2] - arr[2] == 18 && target[1] == arr[1] &&       target[0] == arr[0]) {           yes = true;       }       if(yes) {       //    print();           System.out.println("YES");           System.exit(0);       }    }    private static void print() {        for(int i : arr) {            System.out.print(i + " ");        }        System.out.println();    }    private static void swap(int a,int b) {        int help = arr[a];        arr[a] = arr[b];        arr[b] = help;    }      public static void main(String[] args) throws IOException {      //  perm(0);      //  System.out.println(permutations);        BufferedReader bufferedReader =                new BufferedReader(                        new InputStreamReader(                                System.in));        String[] line = bufferedReader.readLine().split("\\.");        for(int i = 0;i < line.length;i++) {            target[i] = Integer.parseInt(line[i]);        }        String[] line2 = bufferedReader.readLine().split("\\.");        for(int i = 0;i < line2.length;i++) {            arr[i] = Integer.parseInt(line2[i]);        }        checkP();        perm(0);        System.out.println("NO");    }}
