import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            int n = sc.nextInt();
            int[] arr = new int[26];
            for(int j=0; j<n; j++){
                String s = sc.next();
                for(int k=0; k<s.length(); k++){
                    int as = s.charAt(k) - 'a';
                    arr[as] += 1;
                }
            }
            boolean c = false;
            for(int j=0; j<26; j++){
                if(arr[j]%n != 0){
                    c = true;
                    break;
                }else{
                    c = false;
                }
            }
            System.out.println(!c?"YES":"NO");
        }
    }
}
