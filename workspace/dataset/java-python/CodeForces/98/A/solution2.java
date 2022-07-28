import java.util.Arrays;
import java.util.Scanner;

public class A98 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = "ROYGBV";
        String str = scn.next().trim();
        char ch[] = str.toCharArray();
        int[] freq = new int[6];
        for(char c :ch)
            freq[s.indexOf(c)]++;

        Arrays.sort(freq);

        String f = "";
        for(int x:freq){
            f = f+x;
        }

        int result = 0;

        if(f.equals("000006")){
            result = 1;
        }else if(f.equals("000015")){
            result = 1;
        }else if(f.equals("000024")){
            result = 2;
        }else if(f.equals("000123")){
            result = 3;
        }else if(f.equals("000222")){
            result = 6;
        }else if(f.equals("001113")){
            result = 5;
        }else if(f.equals("001122")){
            result = 8;
        }else if(f.equals("000033")){
            result = 2;
        }else if(f.equals("011112")){
            result = 15;
        }else if(f.equals("111111")){
            result = 30;
        }else if(f.equals("000114")){
            result = 2;
        }
        
        System.out.println(result);
    }
}

