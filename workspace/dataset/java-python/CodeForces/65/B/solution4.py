n = int(input()) l = []
for i in range(n):    l.append(int(input())) 

def repair(x, y, r):    if


    (r == 0):
return x
z = (x % (10 * r)) // r - (y % (10 * r)) // r
if (z == 0):        return repair(x, y, r // 10)
if (x % r >= y % r):
    return x - z * r    else:
    if
    (z != 1):
return x - z * r + r
return x - x % r + (x % r) % (10 ** (len(str(x % r)) - 1)) y = 1000
try:    for
i in range(n): l[i] = repair(l[i], y, 1000)
if (l[i] > 2011):            raise Exception()
y = l[i]
for i in l:        print(i)except:    print("No solution")
