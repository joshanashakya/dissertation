import sys

input = sys.stdin.readline

for test in range(int(input())):
    n = int(input())
    a = [int(i) for i in input().split()]
    if a[0] + a[1] > a[-1]:
        print(-1)
    else:
        print(1, 2, n)
