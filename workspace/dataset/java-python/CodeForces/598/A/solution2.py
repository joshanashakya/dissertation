from math import log2 def f(n):    return 2 ** (int(log2(n)) + 1) - 1def sum1(n):    return (n + 1) * n // 2for i in range(int(input())):    n = int(input())    print(sum1(n) - 2 * f(n))
