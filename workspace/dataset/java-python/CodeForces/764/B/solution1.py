n=int(input())a=list(input().split())k=n//2for i in range(0,k,2):   a[i],a[n-i-1]=a[n-i-1],a[i]print(*a)
