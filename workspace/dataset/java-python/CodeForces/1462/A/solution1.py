t = int(input())
for j in range(t):    n = int(input())
a = list(map(int, input().split()))
count = 0
for i in range(n):        new = []
if i % 2 == 0:
    new.append(a[count])        else:
    new.append(a[n - count - 1])
count += 1
print(*new, end=" ")
