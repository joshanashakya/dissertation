#import sys#import math#sys.stdout=open("python/output.txt","w")#sys.stdin=open("python/input.txt","r") t=int(input())for i in range(t):    n,a,b,c,d=map(int,input().split())    mini=(a-b)*n    maxi=(a+b)*n    if maxi<c-d or c+d<mini:        print("NO")    else:        print("YES")
