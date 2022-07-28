from math import ceilt = int(input()) for i in range(t):    n, x = map(int, input().split())
a = list(map(int, input().split()))     max_a = 0
for j in a:        max_a += ceil(j / x)
min_a = ceil(sum(a) / x)     print(min_a, max_a)
