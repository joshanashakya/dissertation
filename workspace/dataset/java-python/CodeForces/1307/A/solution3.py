#import sys#import math#sys.stdout=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/output.txt","w")#sys.stdin=open("C:/Users/pipal/OneDrive/Desktop/VS code/python/input.txt","r")t=int(input())for i in range(t):    n,d=map(int,input().split())    l=list(map(int,input().split()))    s=0    chc=0    add=0    for i in range(1,len(l)):        for j in range(l[i]):            s+=i            add+=1            if s==d:                print(l[0]+add)                chc=1                break            if s>d:                print(add-1+l[0])                chc=1                break        if chc==1:            break    if chc==0:        print(sum(l))          