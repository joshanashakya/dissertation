import sysimport

mathimport
collectionsdef
get_ints():
return map(int, sys.stdin.readline().strip().split())


def get_list(): return list(map(int, sys.stdin.readline().strip().split()))


def get_string(): return sys.stdin.readline().strip()


n, m, val = get_ints()
keyboard = []
shift = []
unique = set()
for i in range(n):    row = list(get_string())
keyboard.append(row)
for j in range(m):        if
row[j] == "S": shift.append([i, j]) else:            unique.add(row[j])
distance = dict()
for i in range(n):    row = keyboard[i]
for j in range(m):        ele = row[j]
if ele == "S":            continue
for k in range(len(shift)):            x = abs(shift[k][0] - i)
y = abs(shift[k][1] - j)
gap = math.sqrt(x ** 2 + y ** 2)
if ele in distance:
    distance[ele] = min(distance[ele], gap)            else:
    distance[ele] = gapq = int(input())
inp_string = list(get_string())
count = 0
for i in inp_string:    if
i.lower() == i:
if i in distance or i in unique:
    continue        else:
    count = -1
break else:        if i.lower() in distance:            gap = distance[i.lower()]
if gap > val:
    count += 1        else:
    count = -1
breakprint(count)
