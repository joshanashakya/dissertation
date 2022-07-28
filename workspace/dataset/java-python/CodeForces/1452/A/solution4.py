import sys input = sys.stdin.readline t = int(input())
for _ in range(t):    x, y = map(int, input().split())     steps = min(x, y) * 2
extra = abs(x - y)     steps += 2 * extra
steps -= extra > 0
print(steps)
