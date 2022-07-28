import java.util.Scanner;
 
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String password = scanner.nextLine();
        String num [] = new String[10];
        for (int i = 0; i < 10; i++) {
            num  [i] = scanner.nextLine();
        }
        System.out.println(solve(num,password));
    }
    public static String solve(String [] num , String password){
        String str = "";
        int count2 = 0;
        for (int j = 0; j < 8; j++) {
 
            String str2 = password.substring(count2, (count2+10));
            for (int i = 0; i < num.length; i++) {
                if (str2.equals(num[i])){
                    str = str + i;
                    count2 = count2+10;
                    break;
                }
            }
        }
 
        return str;
    }
}
