import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class LettersShift {    public static void main(String[] args) throws IOException {        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));        String s = r.readLine();        char[] o = s.toCharArray();        int j = 0;        for(; j < o.length - 1; j++)            if(o[j] > n(o[j]))                break;        for(int i = j; i < o.length; i++)            if(i != j && o[i] < n(o[i]))                break;            else                o[i] = n(o[i]);        System.out.println(new String(o));    }     public static char n(char c){        return c == 'a' ? 'z' : (char) (c-1);    }}
