n = int(input())a = [int(i) for i in input().split()]for i in range(1, n - 1):    if a[i] == 0 and a[i - 1] == 1 and a[i + 1] == 1:        a[i] = 1print(sum(a))
