import math#t=int(input())#lst = list(map(int, input().strip().split(' ')))n,s = map(int, input().strip().split(' '))l=[]for i in range(n):    x,y,k = map(int, input().strip().split(' '))    l1=[]    l1=[math.sqrt(x*x + y*y),k]    l.append(l1)l.sort(key = lambda l: l[0]) #print(l)t=-1f=0for i in range(n):    t=l[i][0]    s+=l[i][1]    if s>=1000000:        f=1        print(t)        breakif f==0:    print(-1)                  