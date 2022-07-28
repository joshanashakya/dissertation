t = int(input())
for i in range(t):    n, x = map(int, input().split())
count = 1
t = 3
while t <= n:        t += x
count += 1
print(count)
