# import time
# start = time.time()
from sys import stdin

input = stdin.readline

input()
*a, = list(map(int, input().split()))
s, r = [0] * 2
cnt = [0] * 100002
for i in a:
    cnt[i] += 1
    if cnt[i] % 4 == 0:
        s += 1
    if cnt[i] % 2 == 0:
        r += 1
q = int(input())
for i in range(q):
    sign, n = input().split()
    n = int(n)
    if sign == '+':
        cnt[n] += 1
        if cnt[n] % 4 == 0:
            s += 1
        if cnt[n] % 2 == 0:
            r += 1
    elif sign == '-':
        if cnt[n] % 4 == 0:
            s -= 1
        if cnt[n] % 2 == 0:
            r -= 1
        cnt[n] -= 1
    print('YES' if s > 1 or (s == 1 and r > 3) else 'NO')
# print((time.time() - start)*1000)
