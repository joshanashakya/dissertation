n, k = map(int, input().split())a = list(map(int, input().split()))j = 0a.sort()n1 = nfor i in range(n):    while a[j] < a[i]:        if a[i] <= a[j] + k:            n1 -= 1        j += 1print(n1)
