import sys input = sys.stdin.buffer.readline t = int(input())
for _ in range(t):    n, x = map(int, input().split())
A = reversed(list(map(int, input().split())))
B = list(map(int, input().split()))     ok = True
for a, b in zip(A, B):        if
a + b > x: ok = False
break     print("Yes" if ok else "No")     if _ < t - 1:        input()
