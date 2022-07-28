import sys input = sys.stdin.buffer.readline ans = "1 " * 100 t = int(input())
for _ in range(t):    n = int(input())
print(ans[:2 * n - 1])
