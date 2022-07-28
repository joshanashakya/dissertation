import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Scanner; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main{    public static void main(String[] args)    {        InputStream inputStream = System.in;        OutputStream outputStream = System.out;        Scanner in = new Scanner(inputStream);        PrintWriter out = new PrintWriter(outputStream);        TaskB solver = new TaskB();        solver.solve(1, in, out);        out.close();    }     static class TaskB    {        public void solve(int testNumber, Scanner in, PrintWriter out)        {            int N = in.nextInt();            int A = in.nextInt(), B = in.nextInt();            int nums[] = CPUtils.readIntArray(N, in);            int answer[] = new int[N];             for (int i = 0; i < N; i++)            {                int ai = (int) (((long) nums[i] * A) % B);                answer[i] = ai / A;            }            CPUtils.printIntArray(answer, out);         }     }     static class CPUtils    {        public static int[] readIntArray(int size, Scanner in)        {            int[] array = new int[size];            for (int i = 0; i < size; i++)            {                array[i] = in.nextInt();            }            return array;        }         public static void printIntArray(int[] array, PrintWriter out)        {            StringBuilder stringBuilder = new StringBuilder();            for (int i = 0; i < array.length; i++)            {                stringBuilder.append(array[i] + " ");            }            out.print(stringBuilder.toString());        }     }} 
