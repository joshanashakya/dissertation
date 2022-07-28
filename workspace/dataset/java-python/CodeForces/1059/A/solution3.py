n, L, a = map(int, input().split())actual = 0breaks = 0 for i in range(n):    t, l = map(int, input().split())    breaks += (t-actual)//a    actual = t + l print(breaks + (L-actual)//a)
