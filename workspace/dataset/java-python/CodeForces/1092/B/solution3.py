n=int(input())a=list(map(int,input().split()))a.sort()print(sum(a[1::2])-sum(a[0::2]))
