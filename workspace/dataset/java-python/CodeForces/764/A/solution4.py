import sysfrom math import gcd def main():    n, m, z = map(int, sys.stdin.read().strip().split())    return z//(n*m//gcd(n,m))    print(main())
