import sys def main():    n = int(sys.stdin.read().strip())    return n != 1 and (n, n) or (-1,)        print(*main())
