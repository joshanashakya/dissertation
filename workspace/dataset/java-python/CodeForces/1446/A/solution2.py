import sys, mathfrom

collections
import defaultdict, dequeinput=sys.stdin.readline  t = int(input())
while (t > 0):    n, w = map(int, input().split())
l = list(map(int, input().split()))
ll = []
f = 0
mini = math.ceil(w / 2)
cursum = 0
for i in range(n):        cur = l[i]
if (cur >= mini and cur <= w):            print(1)
print(i + 1)
f = 1
break elif (cur < mini): ll.append(i + 1)
if (f == 0):        ans = []
for i in ll:            cursum += l[i - 1]
ans.append(i)
if (cursum >= mini):                break
if (cursum >= mini):            print(len(ans))
print(*ans) else:            print(-1)
t -= 1 
