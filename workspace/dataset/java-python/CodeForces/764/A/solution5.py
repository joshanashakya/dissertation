import math  if __name__ == '__main__':    n, m, z = map(int, input().split())    print(z // (n * m // math.gcd(n, m)))
