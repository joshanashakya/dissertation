import sys input = sys.stdin.buffer.readline t = int(input())
for _ in range(t):    n, m = map(int, input().split())
S = sum(list(map(int, input().split())))
print("YES" if S == m else "NO")
