from math import gcddef getDays(n):  if n%100==0 and n%400==0:    return 366  if n%100!=0 and n%4==0:    return 366  return 365y=int(input())v=getDays(y)sd=getDays(y)while True:  y+=1  if getDays(y)==v and sd%7==0:    print(y)    break  sd+=getDays(y)     	 	 	       		  	 		 					 				
