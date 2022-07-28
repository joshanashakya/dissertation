import java.util.Scanner; public class SpitProblem { //29A     static class Pair    {        int x;        int d;         public Pair(int x, int d)        {            this.x = x;            this.d = d;        }    }     static int binarySearch(Pair[] arr, int low, int high, int value, int target)    {        if(low > high)            return -1;         int mid = low + (high - low)/2;         //System.out.println("Value = " + value);        //System.out.println("arr[mid] = " + arr[mid].x);         if(arr[mid].x == value)        {            if(arr[mid].x + arr[mid].d == target)            {                //System.out.println(arr[mid].x + " " + arr[mid].d);                //System.out.println("REACHED");                return mid;            }        }         if(arr[mid].x < value)            return binarySearch(arr, mid+1, high, value, target);         return binarySearch(arr, low, mid-1, value, target);    }     static int partition(Pair[] arr, int low, int high)    {        int pivot = arr[high].x;        int i = low - 1;        for (int j = low; j < high; j++)        {            if (arr[j].x < pivot)            {                i++;                Pair temp = arr[i];                arr[i] = arr[j];                arr[j] = temp;            }        }         Pair temp = arr[i+1];        arr[i+1] = arr[high];        arr[high] = temp;         return i+1;    }     static void sort(Pair[] arr, int low, int high)    {        if (low < high)        {            int pi = partition(arr, low, high);            sort(arr, low, pi-1);            sort(arr, pi+1, high);        }    }     public static void main(String[] args)    {        Scanner sc = new Scanner(System.in);        int camels = sc.nextInt();        Pair[] arr = new Pair[camels];         for(int i = 0; i < arr.length; i++)        {            Pair p = new Pair(sc.nextInt(), sc.nextInt());            arr[i] = p;            sort(arr, 0, i);        }         //for (Pair value : arr) System.out.println("(" + value.x + ", " + value.d + ")" + " = " + (value.x + value.d));        //System.out.println();         boolean flag = false;        for (Pair pair : arr)        {            //System.out.println("----------------------------------------------------");            int res = binarySearch(arr, 0, arr.length - 1,pair.x + pair.d, pair.x);            //System.out.println("----------------------------------------------------");             if (res > -1)            {                flag = true;                System.out.println("YES");                break;            }        }         if(!flag)            System.out.println("NO");         sc.close();    }}
