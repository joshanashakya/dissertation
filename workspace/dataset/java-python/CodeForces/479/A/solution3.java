// ctrl+shift+o all unrecognised classes are automatically imported in code//ctrl+I to indent the code properly// ctrl+D to delete the whole current line// ctrl+space gives the autocomplete recomendation// sysout and ctrl+space gives println() statement// alt+shift+r TO rename the file// ctrl+f11 to run the code import java.util.*;public final class test{    public static void main(String[] args) {    	Scanner s=new Scanner(System.in);    	int a=s.nextInt();    	int b=s.nextInt();    	int c=s.nextInt();    	    	int ans = a + b + c;    	ans = Math.max(ans, (a + b) * c);    		ans = Math.max(ans, a * (b + c));    		ans = Math.max(ans, a * b * c);    	System.out.print(ans);    	    	s.close();    	    	    } }