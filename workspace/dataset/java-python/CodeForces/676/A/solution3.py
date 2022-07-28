import sys def main():    n, *l = map(int, sys.stdin.read().strip().split())    x, y = (i for i, j in enumerate(l, 1) if j in {1, n})    return max(y - 1, n - x) print(main())
