import com.sun.org.apache.bcel.internal.generic.AALOAD;import com.sun.org.apache.bcel.internal.generic.GOTO;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.*;import java.util.stream.IntStream;import javafx.util.Pair;import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java; public class Main{        public static void main(String[] args) throws IOException    {        Scanner input = new Scanner(System.in);        int n = input.nextInt();        int roadCross[] = new int[n];        int firstRow[] = new int[n];        int secondRow[] = new int[n];        ArrayList<Long> ans = new ArrayList<>();                for (int i = 1; i <=n-1; i++) {            firstRow[i] = input.nextInt();                    }                long secondSum=0;        for (int i = 1; i <=n-1; i++) {            secondRow[i] = input.nextInt();            secondSum+=secondRow[i];        }        for (int i = 0; i <n; i++) {            roadCross[i] = input.nextInt();        }        long left=0;        long right=secondSum;        for (int i = 0; i <n; i++) {            long oneRoad = 0;            left+=firstRow[i];            oneRoad+=left;            oneRoad+=roadCross[i];            right-=secondRow[i];            oneRoad+=right;            ans.add(oneRoad);        }        Collections.sort(ans);        System.out.println(ans.get(0)+ans.get(1));                                    }        }
