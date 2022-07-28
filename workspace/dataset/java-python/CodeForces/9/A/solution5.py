from math import *a, b = map(int, input().split())print((7 - max(a, b)) // gcd(7 - max(a, b), 6), 6 // gcd(7 - max(a, b), 6), sep='/')
