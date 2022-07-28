m = int(input())
n = {}
n[5] = 0
n[4] = 0
n[3] = 0
n[2] = 0
n[1] = 0

for i in range(m):
    g = input().split()
    n[int(g[0])] += 1
    n[int(g[1])] += 1
if n[1] == n[2] == n[3] == n[4] == n[5] == 2:
    print('FAIL')
    exit()
print('WIN')
