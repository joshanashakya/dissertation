#import sys#import math#sys.stdout=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/output.txt","w")#sys.stdin=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/input.txt","r")#t=int(input())#for i in range(t): n=int(input())l=list(map(int,input().split()))new=[]for i in range(n):    new.append(l[i])l.sort(reverse=True)s=0for i in range(n):    s+=l[i]*i+1print(s) for i in range(n):        print(new.index(l[i])+1,end=' ')    new[new.index(l[i])]=-1print()              
