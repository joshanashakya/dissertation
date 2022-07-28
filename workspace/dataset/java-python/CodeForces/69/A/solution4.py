n = int(input())
res = [[None, None, None] for i in range(n)]
for i in range(n):    res[i][0], res[i][1], res[i][2] = list(map(int, input().split()))
ans = [0] * 3 for i in range(n):    ans[0] += res[i][0] for i in range(n):    ans[1] += res[i][1] for i in range(n):
ans[2] += res[i][2] if ans[0] == 0 and ans[1] == 0 and ans[2] == 0:    print("YES")
exit()
print("NO")
