for _ in range(int(input())):    n, t = map(int, input().split())
li = list(map(int, input().split()))
tmp = 0
for i in range(n):        if
li[i] < t / 2: li[i] = 0 elif li[i] > t / 2: li[i] = 1 else:            li[i] = tmp % 2
tmp += 1
print(*li)
