import sys def main():    n = int(sys.stdin.read().strip())    return ''.join(map(str, range(1, 400)))[n-1] print(main())
