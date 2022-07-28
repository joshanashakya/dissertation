from collections import defaultdict, deque, Counter
from sys import stdin, stdout
from heapq import heappush, heappop
import math
import io
import os
import math
import bisect


# ?############################################################


def isPrime(x):
    for i in range(2, x):
        if i * i > x:
            break
        if (x % i == 0):
            return False
    return True


# ?############################################################


def ncr(n, r, p):
    num = den = 1
    for i in range(r):
        num = (num * (n - i)) % p
        den = (den * (i + 1)) % p
    return (num * pow(den, p - 2, p)) % p


# ?############################################################

def primeFactors(n):
    l = []
    while n % 2 == 0:
        l.append(2)
        n = n / 2
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            l.append(int(i))
            n = n / i
    if n > 2:
        l.append(n)
    return list(set(l))


# ?############################################################

def power(x, y, p):
    res = 1
    x = x % p
    if (x == 0):
        return 0
    while (y > 0):
        if ((y & 1) == 1):
            res = (res * x) % p
        y = y >> 1
        x = (x * x) % p
    return res


# ?############################################################


def sieve(n):
    prime = [True for i in range(n + 1)]
    p = 2
    while (p * p <= n):
        if (prime[p] == True):
            for i in range(p * p, n + 1, p):
                prime[i] = False
        p += 1
    return prime


# ?############################################################

def digits(n):
    c = 0
    while (n > 0):
        n //= 10
        c += 1
    return c


# ?############################################################


def ceil(n, x):
    if (n % x == 0):
        return n // x
    return n // x + 1


# ?############################################################


def mapin():
    return map(int, input().split())


# ?############################################################


# input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline
# python3 15.py<in>op
n = int(input())
l = [int(x) for x in input().split()]
ll = []
if (n == 1):
    print(1, 1)
    print(-l[0])
    print(1, 1)
    print(0)
    print(1, 1)
    print(0)
else:
    # print(l)
    for i in range(n - 1):
        ll.append(l[i] * (n - 1))
        l[i] = l[i] * n
        # print(i, l[i], "adz")

    print(1, n - 1)
    print(*ll)
    print(n, n)
    print(-l[-1])
    l[-1] = 0
    ll = []
    print(1, n)
    # print(l)
    for i in range(n):
        ll.append(-l[i])
    print(*ll)
