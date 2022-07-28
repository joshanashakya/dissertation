a = list(map(int,input().split()))a.sort()if int(a[1] % 2 == 0)+int(a[0] % 2 == 0)==1: print(a[2])else: print(int((((a[1]-a[0])+(a[1]+a[0]))/2)))
