n = int(input())a = [int(i) for i in input().split()]s = abs(a[0]) for i in range(1, n):    s += abs(a[i] - a[i-1]) print(s)
