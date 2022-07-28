import java.util.*;
public class LuckyNumbersEasy {
    static ArrayList<Long> arr = new ArrayList<>();
    static double cons = Math.pow(10, 12);
    static long n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        n = sc.nextLong();
        calc(0);
        Collections.sort(arr);
        System.out.println(arr.get(0));

    }
    public static void calc(long i){
        if(i > cons){
            return;
        }
        String[] temp = Long.toString(i).split("");
        long s = 0;
        long f = 0;
        for(String x: temp){
            if(x.equals("4")){
                f++;
            }else{
                s++;
            }
        }

        if(i >= n && s == f){
            arr.add(i);
        }
        calc((i * 10) + 4);
        calc((i * 10) + 7);

    }
}

