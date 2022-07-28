n = int(input())a = list(map(int, input().split()))[:n]res=[a.index(1),a.index(n)]print(max(max(res),n-min(res)-1))
