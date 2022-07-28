import sys def main():    l, r, a = map(int, sys.stdin.read().strip().split())    t = min(abs(l-r), a)    a = (a - t)//2    return 2*(min(l, r) + t + a)    print(main())
