n = int(input())a = list(map(int,input().split()))a.sort()s = sum(a[:-1])print(a[-1]-s+1)
