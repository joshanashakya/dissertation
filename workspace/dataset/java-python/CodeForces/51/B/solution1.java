//package com.company; import java.util.ArrayList;import java.util.Scanner;import java.util.Stack; public class Main {     public static void main(String[] args) {       /*        try {            new Solve(new Scanner(new File("/home/morteza/IdeaProjects/testIntellijIdea/src/com/company/a.in")).useDelimiter("\r")).start();        } catch (FileNotFoundException e) {            e.printStackTrace();        }         */         new Solve(new Scanner(System.in)).start();      }     private static class Solve {         private final Scanner SCANNER ;           public Solve(Scanner scanner) {             this.SCANNER = scanner;        }          public void start() {            StringBuilder builder = new StringBuilder();            String line = new String("");            while(SCANNER.hasNextLine()){                try {                    line = SCANNER.nextLine();                }catch (Exception e){                    break;                }                builder.append(line);            }             line = builder.toString();             line = line.replaceAll(" " , "");             line = line.replace( "<table>" , "[");            line = line.replace("<" + '/' + "table>" , "]");             line = line.replace("<" + '/' + "tr>" , "");            line = line.replace( "<tr>" ,  "");             line = line.replace( "<td>" , "(");            line = line.replace("<" + '/' + "td>" , ")");             //line = line.replace("()" , "1");             //System.out.println(line);             Stack<Character> stack = new Stack<>();            ArrayList<Integer> answer = new ArrayList<>();            for(int i = 0 ; i < line.length() ; ++i){                char ch = line.charAt(i);                if(ch == ']'){                    StringBuilder sub = new StringBuilder();                    do {                        sub.append(stack.peek());                        stack.pop();                    }while (!stack.empty() && stack.peek() != '[');                    if(!stack.empty() && stack.peek() == '['){                        stack.pop();                    }                    answer.add(execute(sub.toString()));                 }else {                    stack.push(line.charAt(i));                }             }             answer.sort(Integer::compareTo);            if(!answer.isEmpty()){                System.out.print(answer.get(0));            }            for(int i = 1 ; i < answer.size() ; ++i){                System.out.print(" " + answer.get(i));            }         }         private Integer execute(String s) {            Stack<Character> stack = new Stack<>();            int cnt = 0 ;            for(int i = s.length() - 1 ; i >= 0 ; --i){                if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '('){                    stack.pop();                    cnt++;                }else {                    stack.push(s.charAt(i));                }            }            return cnt;        }     } }       	 	 			  	  		 	     	 		