n,m=list(map(int,input().split()))a=[1]+list(map(int,input().split()))print(sum([(a[i]-a[i-1])%n for i in range(1,m+1)]))
