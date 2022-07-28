t = int(input())
for _ in range(t):    n = int(input())
a = list(map(int, input().split()))
k = 0
ind = 0
while k < n:        print(a[ind], end=' ')
if ind >= 0:            ind *= -1
ind -= 1 else:            ind *= -1
k += 1
print()
