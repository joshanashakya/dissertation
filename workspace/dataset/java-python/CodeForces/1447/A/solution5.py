import sys input = sys.stdin.buffer.readline t = int(input())
for _ in range(t):    n = int(input())
print(n)
print(" ".join(map(str, range(1, n + 1))))
