import sys
from array import array  # noqa: F401


def input():
    return sys.stdin.buffer.readline().decode('utf-8')


x = list(map(int, input().rstrip()))
y = 0
ans = 0

while len(x) > 1:
    if x[-1] ^ y == 1:
        y = 1
        ans += 1
    else:
        y = (x[-1] + y) >> 1
    ans += 1
    x.pop()
if y == 1:
    ans += 1

print(ans)
