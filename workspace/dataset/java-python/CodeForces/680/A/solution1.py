import sysfrom collections import Counter def main():    s = list(map(int, sys.stdin.read().strip().split()))    return sum(s) - max((i*min(j, 3) for i,j in Counter(s).items() if j > 1), default=0) print(main())
