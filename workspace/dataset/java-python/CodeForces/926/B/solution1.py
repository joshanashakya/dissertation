from math import gcdimport sys  def input():    return sys.stdin.buffer.readline().rstrip()  n = int(input())a = list(map(int, input().split()))a.sort()g = 0for i in range(1, n):    g = gcd(g, a[i] - a[i - 1])ans = sum((a[i] - a[i - 1])//g - 1 for i in range(1, n))print(ans) 