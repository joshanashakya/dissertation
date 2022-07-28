for i in range(int(input())):    from math import gcd
n = int(input())
arr = list(map(int, input().split()))
arr.sort()
li = []
li.append(arr.pop())
hcf = li[-1]
while (len(arr) > 0):        m, q = 0, 0
for x in arr:            if
m < gcd(hcf, x): m = gcd(hcf, x)
q = x
li += [q]
arr.remove(q)
hcf = m
print(*li)
