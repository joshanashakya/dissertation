n = int(input())a = list(map(int, input().split()))res = 0for j in range(n - 2, -1, -1):     if a[j] >= a[j + 1]:          a[j] = max(0, a[j + 1] - 1)print(sum(a))
