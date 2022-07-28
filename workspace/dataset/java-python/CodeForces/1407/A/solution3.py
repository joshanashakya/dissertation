for _ in range(int(input())):    n = int(input())
li = list(map(int, input().split()))
nz = 0
no = 0
for i in li:        if
i == 0: nz += 1 else:            no += 1
if nz >= n // 2:        print(nz)
res = [0] * nz
print(*res) else:        print(no - no % 2)
res = [1] * (no - no % 2)
print(*res)
