from math import ceilt = int(input())
for x in range(t):    a, b = map(int, input().split())
if a == 1 or a == 2:        print(1)
continue
a -= 2
print(ceil(a / b) + 1)
