import java.util.Scanner; public class Grammar_Lessons {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String[] statement = sc.nextLine().split(" ");        String ans;        if(isMasculine(statement[0]))            ans = isstatment(statement,0);        else            ans = isstatment(statement,1);        System.out.println(ans);    }     public static boolean isMasculine(String str){        if( (endwith(str,"lios")||endwith(str,"etr")||endwith(str,"initis")))            return true;        else            return false;    }     public static String isstatment(String[] statement,int sex){        int len = statement.length;        int []sta = new int[len];        int[] part;        for(int i=0;i<len;i++) {            part = parts(statement[i]);            if (part[0]!=sex)                return "NO";            else                sta[i] = part[1];        }        if(len == 1)            return "YES";        int count = 0;        if(sta[0] == 2)            count = 1;        for(int i=1;i<len;i++){            if(sta[i] < sta[i-1])                return "NO";            else if(sta[i] ==2)                count ++;        }        if(count == 1) return "YES";        else return "NO";    }     public static boolean endwith(String s1,String s2){        if ( s2.length() > s1.length())            return false;        else if(s1.lastIndexOf(s2) == (s1.length()-s2.length()))            return true;        else            return false;    }    public  static int[] parts(String str){        int[] ans = new int[2];        if(endwith(str,"lios"))        {ans[0] = 0;ans[1] = 1;return ans;}        else if (endwith(str,"liala"))        {ans[0] = 1;ans[1] = 1;return ans;}        else if (endwith(str,"etr"))        {   //System.out.println("etr" + str.lastIndexOf("etr",str.length()));            ans[0] = 0;ans[1] = 2;return ans;}        else if (endwith(str,"etra"))        {    //System.out.println("etr" + str.lastIndexOf("etra",str.length()));            ans[0] = 1;ans[1] = 2;return ans;}        else if (endwith(str,"initis"))        {ans[0] = 0;ans[1] = 3;return ans;}        else if (endwith(str,"inites"))        {ans[0] = 1;ans[1] = 3;return ans;}        else        {ans[0] = 3;ans[1] = -1;return ans;}    }}