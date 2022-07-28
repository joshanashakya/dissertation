from collections import Counter

t = int(input())
for _ in range(t):
    n = int(input())
    ali = list(map(int, input().split()))
    q = ali.count(ali[0])
    if (q == n):
        print(n)
    else:
        print(1)
