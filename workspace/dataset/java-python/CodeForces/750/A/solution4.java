import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class NewYearHurry {    public static void main(String[] args) throws IOException {        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));         StringTokenizer st = new StringTokenizer(f.readLine());         int n = Integer.parseInt(st.nextToken());        int k = Integer.parseInt(st.nextToken());         int totalTime = 240-k;         for(int i = n; i >= 0; i--){            int time = i*(1+i)/2*5;             if(time <= totalTime){                System.out.println(i);                break;            }        }    }}
