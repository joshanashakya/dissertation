import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class Snow_Walking_Robot{ public static void main(String[] args) throws NumberFormatException,IOException{           BufferedReader br =new BufferedReader(new InputStreamReader(System.in));        // write ur code here(        int t = Integer.parseInt(br.readLine());        while(t-- > 0){            String str = br.readLine();            int nU = 0;            int nR = 0;            int nL = 0;            int nD = 0;            for(int i=0;i<str.length();i++){                if(str.charAt(i)=='U'){                    nU++;                }                else if(str.charAt(i)=='R'){                    nR++;                }                else if(str.charAt(i)=='D'){                    nD++;                }                else if(str.charAt(i)=='L'){                    nL++;                }            }                     int kU = Math.min(nU, nD);            int kR = Math.min(nR, nL);                        if(kU==0 && kR!=0){                System.out.println("2");                System.out.println("LR");                continue;            }            else if(kU!=0 && kR==0){                System.out.println("2");                System.out.println("UD");                continue;            }                        StringBuilder ans = new StringBuilder();                                   for(int i=0 ;i<kU;i++){                ans.append("D");                            }            for(int i=0 ;i<kR;i++){                ans.append("R");                            }            for(int i=0 ;i<kU;i++){                ans.append("U");                            }            for(int i=0 ;i<kR;i++){                ans.append("L");                            }            System.out.println(2*(kU + kR));            if((kU + kR)>0)            System.out.println(ans);            else{                continue;            }                        }    }}
