#import sys#import math#sys.stdout=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/output.txt","w")#sys.stdin=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/input.txt","r")#t=int(input())#for i in range(t): n=int(input())l=list(map(int,input().split())) e=0o=0for i in range(n):    if l[i]%2==0:        e+=1    else:        o+=1print(min(o,e))            