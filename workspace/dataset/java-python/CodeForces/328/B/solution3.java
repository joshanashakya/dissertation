//*******************************************************************// Welcome to CompileJava!// If you experience any issues, please contact us ('More Info')  -->//******************************************************************* import java.util.*;import java.io.*; public class CF328B {public static void main(String[] args) throws IOException {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out)); String line = br.readLine();int[] createCount = new int[10];for (int i = 0; i < line.length(); i++) {createCount[line.charAt(i) - '0']++;}createCount[2] += createCount[5];createCount[6] += createCount[9];createCount[5] = 0;createCount[9] = 0; int[] count = new int[10];line = br.readLine();for (int i = 0; i < line.length(); i++) {count[line.charAt(i) - '0']++;}count[2] += count[5];count[6] += count[9];count[5] = 0;count[9] = 0; int min = Integer.MAX_VALUE;for (int i = 0; i < 10; i++) {if (createCount[i] == 0) continue;min = Math.min(min, count[i] / createCount[i]);}  pw.println(min);pw.close();}}   /*import java.lang.Math; // headers MUST be above the first class // one class needs to have a main() methodpublic ss HelloWorld{  // arguments are passed using the text field below this editor  public static void main(String[] args)  {    OtherClass myObject = new OtherClass("Hello World!");    System.out.print(myObject);  }} // you cn add other public classes to this editor in any orderpublic ass OtherClass{  private String message;  private boolean answer = false;  public OtherClass(String input)  {    message = "Why, " + input + " Isn't this something?";  }  public String toString()  {    return message;  }}*/