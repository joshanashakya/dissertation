#import sys#import math#sys.stdout=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/output.txt","w")#sys.stdin=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/input.txt","r")t=int(input())for i in range(t):    n=map(int,input().split())    l=list(map(int,input().split()))    l2=list(map(int,input().split()))    l.sort()    l2.sort()    print(*l)    print(*l2)          