import sys def main():    a, b, c = sorted(map(int, sys.stdin.read().strip().split()))    return max(c + 1 - a - b, 0) print(main())
