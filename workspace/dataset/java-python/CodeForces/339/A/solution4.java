import java.util.Scanner;public class HelpfulMaths {    public static void main(String args[]) {      Scanner  in = new Scanner(System.in);      String input = in.nextLine();      int arr[] = new int[10];      for (int i = 0; i < input.length(); i++){          int index = input.charAt(i) - 48;          arr[index]++;          i++;      }      String output = "";      for (int i = 0; i < arr.length; i++){          if (arr[i] > 0){              while(arr[i] != 0){                  String si = String.valueOf(i);                  if (output.isEmpty())                    output += si;                else                    output += "+" + si;                  arr[i]--;              }          }      }      System.out.print(output);    }}
