n=int(input())a=[int(x) for x in input().split()]a.sort()print(min(a[-2]-a[0],a[-1]-a[1]))
