import sysfrom math import ceil def main():    _, m, *l = map(int, sys.stdin.read().strip().split())    return int(ceil(abs(sum(l))/m))        print(main())
