#import sys#import math#sys.stdout=open("python/output.txt","w")#sys.stdin=open("python/input.txt","r")t=int(input())for i in range(t):    n,m=map(int,input().split())    if n==1 or m==1:        print("YES")    elif n==2 and m==2:        print("YES")    else:        print("NO")     
