import java.lang.*;import java.util.*; public class Solution{        static int n = 100001;            static ArrayList<Integer> arr[] = new ArrayList[n];        public static void divisors(){           for(int j=0;j<n;j++){            arr[j] = new ArrayList<Integer>();        }                for(int i=1;i<n;i++){            for(int j=1;j*j<=i;j++){                if(i%j == 0){                    if(i/j == j){                        arr[i].add(j);                    }else{                        arr[i].add(j);                        arr[i].add(i/j);                    }                }                            }        }                    }    public static void main (String[] args) {                divisors();                Scanner sc  = new Scanner(System.in);                int n = sc.nextInt();        int x,y;        Map<Integer,Integer> map = new HashMap<Integer,Integer>();                for(int i=1;i<=n;i++){                        x = sc.nextInt();                y = sc.nextInt();            int count = 0;                        for(int j = 1;j<arr[x].size();j++){                if(map.get(arr[x].get(j)) != null && map.get(arr[x].get(j)) >= i-y && map.get(arr[x].get(j)) < i){                    count++;                }            }                        for(int j=1;j<arr[x].size();j++){                map.put(arr[x].get(j),i);             }            if(y == 0)                System.out.println(arr[x].size());            else                System.out.println(arr[x].size()-1-count);        }    }}