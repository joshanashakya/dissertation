from math import ceil t = int(input()) l = 'zyxwvutsrqponmlkjihgfedcba'for i in range(t):    n, a, b = map(int, input().split())     x = l[:b]    x = (x * ceil(a/b))[:a]    x = (x * ceil(n/a))[:n]     print(x)