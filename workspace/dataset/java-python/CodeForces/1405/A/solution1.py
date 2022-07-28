t = int(input())
ans = []
for i in range(t):    n = input()
p = input().split()
p.reverse()
ans.append(p)
for j in ans:    print(" ".join(j))
