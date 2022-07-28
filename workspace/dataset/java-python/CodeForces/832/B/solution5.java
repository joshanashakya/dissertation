import java.util.HashSet;import java.util.Scanner;import java.util.Set; /** * @program: spdbAlgorithm * @description: https://vjudge.net/contest/400471#problem/A * @author: LiLinfei * @create: 2020-10-14 */public class Main2020_4_02 {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        String s1 = in.next();        Set<Character> setS1 = new HashSet<>();        for(char c : s1.toCharArray()){            setS1.add(c);        }        String s2 = in.next();         int flag = -1;//*不存在        int index = 0;        if(s2.charAt(0) == '*'){            flag = 0;//*在字符串首        }else if(s2.charAt(s2.length()-1) == '*'){            flag = 2;//*在字符串尾        }else{            for(char c : s2.toCharArray()){                if(c == '*'){                    flag = 1;//*在中间                    break;                }                index++;            }        }        int n = in.nextInt();        for(int i=0; i<n; i++){            String s2Temp = s2;            String s3 = in.next();            if(flag == -1){//没有*                if(s2Temp.length() != s3.length()){                    System.out.println("NO");                    continue;                }                if(isSame(setS1,s2Temp,s3)){                    System.out.println("YES");                }else {                    System.out.println("NO");                }            }else if(s2Temp.length() > s3.length()+1){                    System.out.println("NO");            }else if (flag == 0){//*在左边                s2Temp = s2Temp.substring(1);                int len2 = s2Temp.length();                String s3_1 = s3.substring(0,s3.length()-len2);                String s3_2 = s3.substring(s3.length()-len2);                if(isSame(setS1,s2Temp,s3_2) && isBadWord(setS1,s3_1)){                    System.out.println("YES");                }else {                    System.out.println("NO");                }            }else if (flag == 1){//*在中间                String s2_1 = s2Temp.substring(0,index);                String s2_2 = s2Temp.substring(index+1);                int len2_1 = s2_1.length(),len2_2 = s2_2.length();                String s3_1 = s3.substring(0,len2_1);                String s3_2 = s3.substring(len2_1,s3.length()-len2_2);                String s3_3 = s3.substring(s3.length()-len2_2);                if(isSame(setS1,s2_1,s3_1) && isBadWord(setS1,s3_2) && isSame(setS1,s2_2,s3_3)){                    System.out.println("YES");                }else {                    System.out.println("NO");                }            }else{//*在右边                s2Temp = s2Temp.substring(0,s2Temp.length()-1);                int len2 = s2Temp.length();                String s3_1 = s3.substring(0,len2);                String s3_2 = s3.substring(len2);                if(isSame(setS1,s2Temp,s3_1) && isBadWord(setS1,s3_2)){                    System.out.println("YES");                }else {                    System.out.println("NO");                }            }        }     }    private static boolean isSame(Set setS1, String s2, String s3){        int len2 = s2.length();        for(int j=0; j<len2; j++){            if(s2.charAt(j) != s3.charAt(j)){                if(s2.charAt(j) != '?' || (s2.charAt(j) == '?' && !setS1.contains(s3.charAt(j)) )){                    return false;                }            }        }        return true;    }    private static boolean isBadWord(Set setS1,String s3){        int len3 = s3.length();        for(int j=0; j<len3; j++){            if(setS1.contains(s3.charAt(j))){                return false;            }        }        return true;    } }   		 			 	 	  		 	 		     	
