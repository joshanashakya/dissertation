//*******************************************************************// Welcome to CompileJava!// If you experience any issues, please contact us ('More Info')  -->//******************************************************************* import java.util.*;import java.io.*; public class Island {public static void main(String[] args) throws IOException {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out)); int n = Integer.parseInt(br.readLine());int[] arr1 = new int[n - 1];int[] arr2 = new int[n - 1];StringTokenizer st = new StringTokenizer(br.readLine()); for (int i = 0; i < n - 1; i++) {int a = Integer.parseInt(st.nextToken());if (a == 0) {i-=1;continue;}arr1[i] = a;} st = new StringTokenizer(br.readLine()); for (int i = 0; i < n-1; i++) {int a = Integer.parseInt(st.nextToken());if (a == 0) {i -= 1;continue;}arr2[i] = a;} pw.println(sameCycle(arr1, arr2) ? "YES" : "NO");pw.close();}private static boolean sameCycle(int[] arr1, int[] arr2) {int i = 0;int j = arrayIndexOf(arr2, arr1[0]);for (; i < arr1.length; i++) {if (arr1[i] != arr2[j]) return false;j = (j + 1) % arr1.length;}return true;}private static int arrayIndexOf(int[] a, int needle) {for (int i = 0; i < a.length; i++) {if (a[i] == needle) return i;}return -1;}} /*iport java.lang.Math; // headers MUST be above the first class // one class needs to have a main() methodpublicass HelloWorld{  // arguments are passed using the text field below this editor  public static void main(String[] args)  {    OtherClass myObject = new OtherClass("Hello World!");    System.out.print(myObject);  }} // you can add other public classes to this editor in any orderpublicass OtherClass{  private String message;  private boolean answer = false;  public OtherClass(String input)  {    message = "Why, " + input + " Isn't this something?";  }  public String toString()  {    return message;  }}*/