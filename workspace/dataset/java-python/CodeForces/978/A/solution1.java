import java.util.*; public class codeforces {    public static void main(String[]args){        Scanner sc = new Scanner(System.in);         int n = sc.nextInt();        int []arr = new int[n];   int max = 0;        for(int i=0;i<n;i++){            arr[i] = sc.nextInt();            max = Math.max(max,arr[i]);        }        boolean []bool = new boolean[max+1];         int []indicies = new int[max+1];        for(int i=0;i<n;i++){            if(bool[arr[i]]==false){                bool[arr[i]]=true;                indicies[arr[i]] = i;            }else{                arr[indicies[arr[i]]] = -1;                indicies[arr[i]] = i;            }        }        int counter = 0;        for(int i=0;i<n;i++){            if(arr[i]!=-1){                counter++;            }        }        System.out.println(counter);        for(int i=0;i<n;i++){            if(arr[i]!=-1){            System.out.print(arr[i]+" ");}        }      }}