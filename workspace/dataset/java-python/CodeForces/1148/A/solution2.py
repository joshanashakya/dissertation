import sys def main():    a, b, c = map(int, sys.stdin.read().strip().split())    return c*2 + min(a, b)*2 + bool(b - a)    print(main())
