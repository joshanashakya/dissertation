from math import *from sys import stdininput = stdin.readlineli1 = {}; li2 = {}; li3 = {}for _ in range(int(input())):    x, y = map(int, input().split())    li1[x] = li1.get(x, 0) + 1    li2[y] = li2.get(y, 0) + 1    li3[(x, y)] = li3.get((x, y), 0) + 1sum = 0for x in [*li1.values()] + [*li2.values()]:    sum += (x*(x-1))//2for x in [*li3.values()]:    sum -= (x*(x-1))//2print(sum)