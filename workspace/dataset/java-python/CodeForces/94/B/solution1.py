m = int(input())
n = {}
n[1] = 0
n[2] = 0
n[3] = 0
n[4] = 0
n[5] = 0
for i in range(m):
    a, b = map(int, input().split())
    n[a] += 1
    n[b] += 1
if (n[1] == n[2] == n[3] == n[4] == n[5] and n[1] == 2):
    print("FAIL")
else:
    print("WIN")
