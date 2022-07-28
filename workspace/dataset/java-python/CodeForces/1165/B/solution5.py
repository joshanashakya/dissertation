n = int(input())a = list(map(int, input().split()))a.sort()cur = 1for i in range(n):    if a[i] >= cur:        cur += 1print(cur-1)
