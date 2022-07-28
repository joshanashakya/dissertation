n=int(input())l=list(map(int,input().split()))l.sort()s=sum(l)for i in range(1,n):    if l[i]<=l[i-1]:        l[i]=l[i-1]+1print(sum(l)-s)
