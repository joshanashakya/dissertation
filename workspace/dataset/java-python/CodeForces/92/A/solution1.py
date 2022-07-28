import sys


def main():
    n, m = map(int, sys.stdin.read().strip().split())
    m %= (1 + n) * n // 2
    for i in range(1, n + 1):
        m -= i
        if not m:
            return 0
        elif m < 0:
            return m + i


print(main())
