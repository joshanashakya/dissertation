import java.util.*; public class Main{             public static void main(String[] args)    {        Scanner input = new Scanner(System.in);                String s = input.next();          StringBuilder ans = new StringBuilder();          ArrayList<Integer> a1 = new ArrayList<>(),a2 = new ArrayList<>();               for (int i = 0; i < s.length(); i++) {            if(s.charAt(i)=='r')               ans.append((i+1)+"\n");                    }                              for (int i = s.length()-1; i>=0; i--) {            if(s.charAt(i)=='l')                ans.append((i+1)+"\n");                    }                              System.out.println(ans);//               for (Integer integer : a1) {//                   System.out.println(integer);//        }//               for (int i =a2.size()-1; i >=0; i--) {//                   System.out.println(a2.get(i));//        }          }     }
