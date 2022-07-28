t = int(input())
for i in range(t):    w, h, n = map(int, input().split())
count = 1
while w % 2 == 0:        w /= 2
count *= 2
while h % 2 == 0:        h /= 2
count *= 2
print("YES" if count >= n else "NO")
