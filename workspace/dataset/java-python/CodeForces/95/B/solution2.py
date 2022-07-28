import math
from collections import defaultdict, Counter

R = lambda: map(int, input().split())
org = input()
num = [x for x in org]
n = len(num)
mi, mx = '4' * ((n + 1) // 2) + '7' * ((n + 1) // 2), '7' * ((n + 1) // 2) + '4' * ((n + 1) // 2)
if n % 2:
    print(mi)
    exit(0)
if ''.join(num) > mx:
    print('4' + mi + '7')
    exit(0)
b, sc, fc = -1, 0, 0
for i in range(n):
    if num[i] != '4' and num[i] != '7':
        b = i
        break
    sc += num[i] == '7'
    fc += num[i] == '4'
    if sc > n // 2 or fc > n // 2:
        b = i
        break
if b == -1:
    if sc != n // 2 or fc != n // 2:
        print('1 ' + str(sc) + ' ' + str(fc))
    else:
        print(org)
elif num[b] < '4':
    res = ''.join(num[:b]) + '4' * (n // 2 - fc) + '7' * (n // 2 - sc)
    if res < ''.join(num) or res.count('4') != res.count('7'):
        print('2 ' + str(sc) + ' ' + str(fc))
    else:
        print(res)
elif num[b] < '7':
    res = ''.join(num[:b]) + '7' + '4' * (n // 2 - fc) + '7' * (n // 2 - sc - 1)
    if res < ''.join(num) or res.count('4') != res.count('7'):
        print('3 ' + str(sc) + ' ' + str(fc))
    else:
        print(res)
else:
    sc -= num[b] == '7'
    while num[b - 1] != '4' or n // 2 - sc <= 0:
        sc -= num[b - 1] == '7'
        fc -= num[b - 1] == '4'
        b -= 1
    b -= 1
    fc -= 1
    res = ''.join(num[:b]) + '7' + '4' * (n // 2 - fc) + '7' * (n // 2 - sc - 1)
    if res < ''.join(num) or res.count('4') != res.count('7'):
        print('4 ' + str(sc) + ' ' + str(fc) + ' ' + str(res.count('4')) + ' ' + str(res.count('7')) + ' ' + str(n))
    else:
        print(res)
