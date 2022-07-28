import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.StringTokenizer; public final class CodeForces545B {     public static void main(String args[]) {        FastReader sc = new FastReader();        int n = sc.nextInt();        String st1 = sc.nextLine();        String st2 = sc.nextLine();                ArrayList<Integer> a00 = new ArrayList<>();        ArrayList<Integer> a01 = new ArrayList<>();        ArrayList<Integer> a10 = new ArrayList<>();        ArrayList<Integer> a11 = new ArrayList<>();                for (int i = 0; i < n; i++) {            if(st1.charAt(i)=='0' && st2.charAt(i)=='0'){                a00.add(i);            }            else if(st1.charAt(i)=='0' && st2.charAt(i)=='1'){                a01.add(i);            }            else if(st1.charAt(i)=='1' && st2.charAt(i)=='0'){                a10.add(i);            }            else if(st1.charAt(i)=='1' && st2.charAt(i)=='1'){                a11.add(i);            }        }                int a = a00.size();        int b = a01.size();        int c = a10.size();        int d = a11.size();                int af=0,bf=0,cf=0,df=0;        int found = 0;        for(af=0;af<=a;af++){            for(bf=0;bf<=b;bf++){                df = af - n/2 + b + d;                cf = n/2 - af - bf - df;                if(df<= d && cf<=c && df>=0 && cf>=0){                    found = 1;                    break;                }            }            if(found==1){                break;            }        }                if(found==1){            StringBuilder st = new StringBuilder();            for(int j=0;j<af;j++){                st.append(a00.get(j)+1+" ");            }            for(int j=0;j<bf;j++){                st.append(a01.get(j)+1+" ");            }            for(int j=0;j<cf;j++){                st.append(a10.get(j)+1+" ");            }            for(int j=0;j<df;j++){                st.append(a11.get(j)+1+" ");            }            System.out.println(st.toString().substring(0,st.toString().length()-1));        }        else{            System.out.println(-1);        }    }     static class FastReader {         BufferedReader br;        StringTokenizer st;         public FastReader() {            br = new BufferedReader(new InputStreamReader(System.in));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextLine() {            String str = "";            try {                str = br.readLine();            } catch (IOException e) {             }            return str;        }    }}