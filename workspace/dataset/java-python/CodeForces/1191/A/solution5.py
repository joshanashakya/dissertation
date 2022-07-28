import sys def main():    n = int(sys.stdin.read().strip())    d = {1: '0 A', 3: '2 A', 2: '1 B', 0: '1 A'}    return d[n%4] print(main())
