n=int(input())arr=list(map(int,input().split()))l=[0]*(n+1)for c in arr: l[c]=l[c-1]+1print(n - max(l))
