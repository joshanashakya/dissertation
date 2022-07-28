n = int(input())
common, mas = set(), []
for i in range(n * (n - 1) // 2):    lst = list(map(int, input().split()))
lst.pop(0)
for i, x in enumerate(lst):        common.add(x)
mas.append(set(lst))
if n == 2:    item = list(mas[0])
print(1, item[0])
print(len(item) - 1, *item[1:])
from sys import exit;

exit()
d = {}
for x in common: d[x] = Falsefor
x in common:
if d[x] == False:        res = set(common)
for i, y in enumerate(mas):            if
x in y: res = res & y
print(len(res), *res)
for y in res: d[y] = True
