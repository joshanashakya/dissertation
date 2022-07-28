n = int(input())
for i in range(n):    input()
ls = list(map(int, input().split()))
s = sum(ls)
if s % 2 == 1:
    print('NO')    elif s % 2 == 0:
    s = s / 2
if s % 2 == 0:
    print('YES')        elif s % 2 == 1:
    if
1 in ls: print('YES') else:                print('NO')
