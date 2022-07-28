import sys, mathfrom

collections
import defaultdict, dequeinput=sys.stdin.readline 

def check(arr):    cur = 0


for i in range(n):        cur += (l[i] - arr[i])
return (2 * cur) <= s t = int(input())
while (t > 0):    n = int(input())
l = list(map(int, input().split()))
s = sum(l)
b1 = [1 for _ in range(n)]
b2 = [1 for _ in range(n)]
for i in range(0, n, 2):        b1[i] = l[i]
for i in range(1, n, 2):        b2[i] = l[i]
if (check(b1)):
    print(*b1)    else:
    print(*b2)
t -= 1
