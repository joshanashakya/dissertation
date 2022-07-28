import math  for testcase in range(int(input())):    arr = [int(x) for x in input().split()]
n, k = arr[0], arr[1]
arr = [int(x) for x in input().split()]
c, s = 0, 0
for ele in arr:        if
    (ele % k != 0): c += 1
s += ele
maxc, minc = 0, 0
for ele in arr:        if
    (ele % k == 0): maxc += (ele // k)
minc += (ele // k) else:            m = math.ceil(ele / k)
maxc += m
m = math.ceil(s / k)
minc += m
print(minc, maxc)
