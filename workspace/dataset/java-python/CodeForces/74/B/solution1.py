J = lambda: map(int, input().split())
v, y, z = J()
dir = 'to tail' == input()
for t, x in enumerate(map(int, input())):    if
z == 1: dir = 1 elif z == v: dir = 0
if not x:
    y = min(v, y + 1) if z < y else max(1, y - 1)    else:
    y = 1 if dir else v
z = z + 1 if dir else z - 1
if y == z:        print('Controller ' + str(t + 1))
exit(0)
print('Stowaway')
