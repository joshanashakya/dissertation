

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.text.StyleContext;
import java.awt.image.AreaAveragingScaleFilter;

import javax.print.attribute.Attribute;
import javax.print.attribute.HashAttributeSet;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.channels.AcceptPendingException;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.logging.SimpleFormatter;


    public class Main1 {





        public static void main(String[] args) {




                FastScanner in = new FastScanner();
                PrintWriter out = new PrintWriter(System.out);


                int n = in.nextInt();
                 int dp[] = new int[100009] ;

                 int ct2 = 0 , ct4 = 0 ;

                 // dp creation
            for (int i = 0; i <n ; i++)
                dp[in.nextInt()]++ ;

            for (int i = 1; i <100009 ; i++) {
                int temp = dp[i];
                ct4 += temp/4 ;
                ct2 += (temp%4)/2 ;
            }
            int q = in.nextInt() ;
            while (q-- > 0){
                String s = in.next() ;
                int tt = in.nextInt() ;
                if (s.charAt(0) == '+'){
                    dp[tt]++ ;
                    if (dp[tt]%4 == 0) {
                        ct4++ ;
                        ct2-- ;
                    }
                    else if ( dp[tt]%4 == 2 )ct2++ ;
                }
                else {
                    dp[tt]-- ;
                    if (dp[tt]%4 == 3) {
                        ct4-- ;
                        ct2++ ;}
                    else    if (dp[tt]%4 == 1)ct2-- ;
                }

                if ((ct2 >= 2 && ct4 >= 1) || (ct4 >= 2))
                    out.append("YES\n") ;
                else out.append("NO\n") ;
            }















                out.flush();
                out.close();




        }


















        static class FastScanner {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer("");

            String next() {
                while (!st.hasMoreTokens())
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            int[] readArray(int n) {
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = nextInt();
                return a;
            }


            long nextLong() {
                return Long.parseLong(next());
            }
        }


    }








