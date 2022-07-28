n = int(input())
rat = []
men = []
child = []
captain = []
for i in range(n):    a, b = input().split()
if b == 'rat':
    rat.append(a)    elif b == 'child':
    child.append(a)    elif b == 'woman':
    child.append(a)    elif b == 'man':
    men.append(a)    else:
    captain.append(a)
ans = rat + child + men + captainfor
i in ans: print(i)
