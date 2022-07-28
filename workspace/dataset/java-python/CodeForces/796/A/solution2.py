import sys def main():    n, m, k, *l = map(int, sys.stdin.read().strip().split())    return min(abs(i - m) for i, j in enumerate(l, 1) if j and k >= j)*10    print(main())
