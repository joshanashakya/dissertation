t = int(input())
ans = []
for i in range(t):    l, r = [int(x) for x in input().split()]
if (2 * l) > r:
    ans.append("YES")    else:
    ans.append("NO")
for j in ans:    print(j)
