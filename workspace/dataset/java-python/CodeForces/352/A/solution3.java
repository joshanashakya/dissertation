import java.util.ArrayList;import java.util.Scanner; public class JeffandDigits {    public static void main(String[] args) {        Scanner scanner=new Scanner(System.in);        int n= scanner.nextInt();        System.out.println( getIndex(scanner, n));    }     private static String getIndex(Scanner scanner, int n) {        ArrayList<Integer> arrayList=new ArrayList<>();        for (int i = 0; i < n; i++) {            arrayList.add(scanner.nextInt());        }if (!arrayList.contains(0))    return "-1";int count =0;int count0=0;        for (int i = 0; i < n; i++) {            if(arrayList.get(i)==5)                count++;            if(arrayList.get(i)==0)                count0++;        }       // System.out.println(count);        //int res=(count*5)/9;        if (count<9)            return "0";         while(count%9!=0)        {            count--;        }        StringBuffer s=new StringBuffer("");        for (int i = 0; i <count ; i++) {            s.append("5");        }        for (int i = 0; i <count0 ; i++) {            s.append("0");        }        return s.toString();    }}