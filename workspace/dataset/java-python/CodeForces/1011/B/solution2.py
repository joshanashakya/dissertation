from collections import*R=lambda:map(int,input().split())n,m=R()a=Counter(R()).values()i=1while sum(x//i for x in a)>=n:i+=1print(i-1)          
