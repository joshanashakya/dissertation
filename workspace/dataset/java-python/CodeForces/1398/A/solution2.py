import sys

input = sys.stdin.readline

'''

'''


def non_deg(vals):
    a, b, c = vals
    return a + b > c and a + c > b and b + c > a


t = int(input())
for _ in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    if not non_deg([a[0], a[1], a[-1]]):
        print(1, 2, n)
    else:
        print(-1)
