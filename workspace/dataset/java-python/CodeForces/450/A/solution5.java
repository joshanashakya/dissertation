import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Solution {    public static void main(String[] args) throws IOException {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        int n = Integer.parseInt(st.nextToken());        double m = Double.parseDouble(st.nextToken());        int i = 1;        st = new StringTokenizer(br.readLine());        int max = Integer.MIN_VALUE;        int maxIndex = 1;        while(st.hasMoreTokens()){            double ai = Double.parseDouble(st.nextToken());            int rounds = (int) Math.ceil(ai / m);            if(rounds >= max){                max = rounds;                maxIndex = i;            }            i++;        }        System.out.println(maxIndex);    }}
