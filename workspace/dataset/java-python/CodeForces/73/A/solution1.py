I = lambda: map(int, input().split())
x, y, z, k = I()
a1, a2, a3, q = 0, 0, 0, 0
while q < 3:    q = 0
if a1 + a2 + a3 == k: break
if a1 < x - 1:        a1 += 1
if a1 + a2 + a3 == k:
    break    else:
    q += 1
if a2 < y - 1:        a2 += 1
if a1 + a2 + a3 == k:
    break    else:
    q += 1
if a3 < z - 1:        a3 += 1
if a1 + a2 + a3 == k:
    break    else:
    q += 1
print((a1 + 1) * (a2 + 1) * (a3 + 1))
