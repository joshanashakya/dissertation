from collections import Counter

for i in range(int(input())):
    s = ''
    n = int(input())
    for j in range(n):
        s += input()
    s = list(s)
    cun = Counter()
    cun.update(s)
    res = 0
    for k in cun:
        if (cun[k] % n == 0):
            res += 1
    if (res == len(cun)):
        print('YES')
    else:
        print("NO")
