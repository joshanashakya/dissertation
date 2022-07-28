n = int(input())
for i in range(n):    a = int(input())
s = [int(i) for i in input().split(' ')]
count = {}
for j in range(a):        for
k in range(j + 1, a): compute = s[k] - s[j]
if compute not in count:                count[compute] = 1
print(len(count))
