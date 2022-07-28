from collections import Counter

t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    ali = list(map(int, input().split()))
    q = max(ali)
    for i in range(n):
        ali[i] = q - ali[i]
    if (k % 2 == 0):
        q = max(ali)
        for i in range(n):
            ali[i] = q - ali[i]
    print(*ali)
