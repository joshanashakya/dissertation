n = int(input())
a = list(map(int, input().split()))
ans = None
ind = {}
for i in range(n):
    if ans is not None:
        break
    for j in range(i + 1, n):
        s = a[i] + a[j]
        if s in ind and ind[s][0] != i and ind[s][0] != j and ind[s][1] != i and ind[s][1] != j:
            ans = [i + 1, j + 1, ind[s][0] + 1, ind[s][1] + 1]
            break
        elif s not in ind:
            ind[s] = [i, j]
if ans is not None:
    print("YES")
    print(ans[0], ans[1], ans[2], ans[3])
else:
    print("NO")
