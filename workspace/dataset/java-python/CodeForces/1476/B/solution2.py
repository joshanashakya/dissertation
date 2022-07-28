import sys, mathfrom

collections
import defaultdict, dequeinput=sys.stdin.readline  t = int(input())
while (t > 0):    n, k = map(int, input().split())
l = list(map(int, input().split()))
total = 0
s = l[0]
percneeded = k / 100
for i in range(1, n):        cur = l[i] / s
if (cur > percneeded):            need = math.ceil((100 * l[i]) / k - s)
total += need
s += need
s += l[i]  # print(total)    print(total)    t-=1
