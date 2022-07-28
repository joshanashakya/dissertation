n = int(input())
a = list(map(int, input().split()))
d = {}
bp = False

for i in range(len(a)):
    if bp: break
    for j in range(i + 1, len(a)):
        if bp: break
        c = a[i] + a[j]
        if c in d:
            for k in d[c]:
                if k[0] < i and j != k[1] and i != k[1]:
                    c = [k[0] + 1, k[1] + 1, i + 1, j + 1]
                    bp = True
                    break
        else:
            d[c] = [[i, j]]
if not bp: c = []
if c:
    print("YES")
    print(*c)
else:
    print("NO")
