import java.util.*; public class B {    public static <K, V> K getKey(Map<K, V> map, V value) {        for (Map.Entry<K, V> entry : map.entrySet()) {            if (value.equals(entry.getValue())) {                return entry.getKey();            }        }        return null;    }     public static final class Pair {        public int first;        public int second;        public Pair(int first,int second) {            this.first=first+1;            this.second=second;        } //        public int compareTo(Pair o) {//            return Integer.compare(o.second, second);//        }//        public Pair() {//            first = null;//            second = null;//        }////        public Pair(T1 firstValue, T2 secondValue) {//            first = firstValue;//            second = secondValue;//        } //        public Pair(Pair<T1, T2> pair) {//            first = pair.first;//            second = pair.second;//        }     }     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        Integer[] arr=new Integer[n];        //Map<Integer,Integer> m=new HashMap<>();        //List<Pair<Integer, Integer>> m = new ArrayList<>();        Pair[] pairs=new Pair[n];        //int[] perArray=new int[n];        for (int i = 0; i < n; i++) {            //arr[i]=sc.nextInt();            int x = sc.nextInt();            pairs[i]=new Pair(i,x);           // m.add(new Pair<>(x, i + 1));            //perArray[i]=arr[i];        }       // Collections.sort(m, Collections.reverseOrder());        //Arrays.sort(pairs);        Arrays.sort(pairs, new Comparator<Pair>() {            @Override public int compare(Pair p1, Pair p2)            {                return p2.second - p1.second;            }        });         // System.out.println(Arrays.toString(arr));//        for (int i=0;i<n;i++){//            m.add(new Pair<>(arr[i],i+1));//        }         int ans=0;        for (int i=0;i<n;i++){            ans+=(pairs[i].second)*i+1;        }//        for (int i=0;i<n;i++){//            System.out.println(pairs[i].second);//        }        System.out.println(ans);        for (int i=0;i<n;i++){            System.out.print(pairs[i].first+" ");        }//        for (Pair<Integer, Integer> i : m) {//            System.out.println(i.first);//        }//        Arrays.sort(perArray);//        System.out.println(m);//        int sum=1;//        int c=1;//        List<K> l=new ArrayList<K>();//        l.add(getKey(m,perArray[n-1]));//        for (int i=arr.length-2;i>=0;i--){//           sum+=(perArray[i]*c)+1;//          l.add(getKey(m,perArray[i]));//           c++;//        }//        System.out.println(sum);//        for (K i:l){//            System.out.print(i+" ");//        }     }}
