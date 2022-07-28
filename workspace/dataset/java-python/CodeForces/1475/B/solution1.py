def solve():    n = int(input())


i = 0
while 2021 * i <= n:        if
(n - (i * 2021)) % 2020 == 0:
return True
i += 1
return False   for t in range(int(input())):    if
solve(): print('YES') else: print('NO')
