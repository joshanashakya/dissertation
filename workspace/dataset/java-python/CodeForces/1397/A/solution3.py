from collections import Counter

t = int(input())
for _ in range(t):
    n = int(input())
    c = Counter()
    for i in range(n):
        s = input()
        for j in s:
            c[j] += 1
    f = 0
    for i in c:
        if (c[i] % n != 0):
            f = 1
            break
    if (f == 0):
        print("YES")
    else:
        print("NO")
