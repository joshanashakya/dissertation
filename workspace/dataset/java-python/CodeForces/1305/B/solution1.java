import java.util.Scanner;import java.util.ArrayList;public class Main {    public static void main(String args[]) {        Scanner s = new Scanner(System.in);        String str = s.next();        ArrayList<Integer> open = new ArrayList<>();        ArrayList<Integer> close = new ArrayList<>();        for(int i = 0; i < str.length(); i++){            if(str.charAt(i) == '('){                open.add(i + 1);            }            else{                close.add(i + 1);            }        }        int i = 0,j = close.size() - 1,count = 0;        while(i < open.size() && j >= 0 && open.get(i) < close.get(j) && i * 2 < str.length()){            i++;            j--;        }        if(i > 0){            System.out.println(1);            System.out.println(2 * i);            for(int k = 0; k < i; k++){             System.out.print(open.get(k) + " ");          }        for(int k = j + 1; k < close.size(); k++){            System.out.print(close.get(k) + " ");          }        }        else{            System.out.println(0);        }            }}
