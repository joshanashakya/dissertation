import java.io.*;import java.util.*; public class cf_flyRocket {    public static void main(String[] args) throws IOException {        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        int n = Integer.parseInt(in.readLine());        int m = Integer.parseInt(in.readLine());        String[] inp2 = in.readLine().split("\\s+");        ArrayList<Long> arr = new ArrayList<>();        for(String elm: inp2){            arr.add(Long.parseLong(elm));        }         String[] inp3 = in.readLine().split("\\s+");        ArrayList<Long> arr2 = new ArrayList<>();        for(String elm: inp3){            arr2.add(Long.parseLong(elm));        }         if(arr.get(0)<=1||arr2.get(0)<=1){            System.out.println(-1);            return;        }        double s = m;        s+= s/ (arr.get(0)-1);        for(int i=1;i<n;i++){            if(arr.get(i)<=1||arr2.get(i)<=1){                System.out.println(-1);                return;            }            s+= s/ (arr.get(i)-1);            s+= s/ (arr2.get(i)-1);        }        s+= s/ (arr2.get(0)-1);        System.out.println(s-m);    }}
