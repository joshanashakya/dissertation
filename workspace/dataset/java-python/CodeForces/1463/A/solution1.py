from collections import Countert = int(input())
for _ in range(t):    a, b, c = map(int, input().split())
q = a + b + c
e = min(a, b, c)
w = q // 9
if (q % 9 == 0 and e >= w):
    print("YES")    else:
    print("NO")
