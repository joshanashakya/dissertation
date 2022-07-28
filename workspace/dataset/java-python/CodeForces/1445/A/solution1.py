n = int(input())
for p in range(n):    n1, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))[::-1]
if p != n - 1:        z = input()
for x in range(n1):        if
a[x] + b[x] > k: print('No')
break else:        print('Yes')
