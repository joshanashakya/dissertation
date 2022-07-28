import mathfor

t in range(int(input())): arr = []
n = int(input())
a = list(map(int, input().split()))
for i in range(n // 2):        arr.extend([a[i], a[n - i - 1]])
if (n % 2):        arr.append(a[n // 2])
print(*arr)
