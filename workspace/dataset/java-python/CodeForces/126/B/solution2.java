public class QWERTY {    static String LPS(String pat, int[] lps) {        int M = pat.length(), len = 0, i = 1;        lps[0] = 0;        while (i < M)            if (pat.charAt(i) == pat.charAt(len))                lps[i++] = ++len;            else                if (len != 0)                    len = lps[len - 1];                else                    lps[i++] = 0;        return pat.substring(0, lps[M-1]);    }     public static void main(String[] args) {        String txt = new java.util.Scanner(System.in).next();        int l = txt.length(), max = 0;        int[] lpsf = new int[l]; LPS(txt, lpsf);        int[] lpsb = new int[l]; LPS(new StringBuilder(txt).reverse().toString(), lpsb);        for (int i=2; i<l; i++)            if (lpsf[i-1] > max && lpsf[i-1] == lpsb[l-i+lpsf[i-1]-1])                max = lpsf[i-1];        System.out.println((max == 0)? "Just a legend" : txt.substring(0, max));    }}
