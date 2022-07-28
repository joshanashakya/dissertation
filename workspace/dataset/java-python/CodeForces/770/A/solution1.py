import sysfrom string import ascii_lowercase as az def main():    n, k = map(int, sys.stdin.read().strip().split())    return n//k*az[:k] + az[:n%k] print(main())
