t = int(input())
ans = []
for i in range(t):    n = int(input())
a = [int(x) for x in input().split()]
tmp = 0
for j in range(len(a)):        tmp = max(0, tmp + a[j])
ans.append(tmp)
for k in ans:    print(k)
