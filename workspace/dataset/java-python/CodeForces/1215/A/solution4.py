import sysinput=sys.stdin.readlinefrom collections import defaultdict as dcfrom collections import Counterfrom bisect import bisect_right, bisect_leftimport mathfrom operator import itemgetterfrom heapq import heapify, heappop, heappushfrom queue import PriorityQueue as pqa1=int(input())a2=int(input())k1=int(input())k2=int(input())n=int(input())if k1>k2:    a1,a2=a2,a1    k1,k2=k2,k1x,y=0,0if n==a1*k1+a2*k2:    print(a1+a2,a1+a2)else:    a=n    a-=a2*(k2-1)    a-=a1*(k1-1)    if a<=0:        x=0    else:        x=a    y=0    a=n    while(a>0 and a1):        #print('str1')        if a-k1>=0:            y+=1            a-=k1            a1-=1        else:            a=0    while(a>0 and a2):        #print('str2')        if a-k2>=0:            y+=1            a-=k2            a2-=1        else:            a=0    print(x,y)                
