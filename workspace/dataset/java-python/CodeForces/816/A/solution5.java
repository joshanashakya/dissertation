import java.io.File;import java.io.IOException;import java.io.PrintWriter;import java.util.*; public class Main{               public static void main(String[] args)    {        Scanner input = new Scanner(System.in);               String number[] = input.next().split(":");      int number1  =Integer.parseInt(number[0]);      int number2 = Integer.parseInt(number[1]);      int count=0;                while(true)        {                                      if((number1/10)==(number2%10)&&((number1%10)==(number2/10)))            {               break;             }            number2++;            if(number2==60)            {               number1++;                        number2=0;             }            if(number1==24)            {                number1=0;            }            count++;                        }              System.out.println(count);                           }       }   