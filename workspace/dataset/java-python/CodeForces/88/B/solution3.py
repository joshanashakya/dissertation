from math import sqrtn, m, x = list(map(int, input().split()))
keyboard = {}
for i in range(n):    line_raw = input()
for j in range(len(line_raw)):        if
line_raw[j] in keyboard: keyboard[line_raw[j]].append((i, j)) else:            keyboard[line_raw[j]] = [(i, j)]


def dist(A, B):    return sqrt((A[0] - B[0]) ** 2 + (A[1] - B[1]) ** 2)


dist_from_shift = {}
for key, pos in keyboard.items():    min_pos = float('inf')
if 'S' in keyboard and key != 'S':        for
kp in pos:
for shift_pos in keyboard['S']:                min_pos = min(min_pos, dist(kp, shift_pos))
dist_from_shift[key.upper()] = min_pos
q = int(input())
query = input()
count = 0
found = Truefor
c in query:
if c.isupper():        if
c.lower() in keyboard and 'S' in keyboard:
if dist_from_shift[c] > x:
    count = count + 1        else:
    found = False
print("-1")
break else:        if c not in keyboard:            found = False
print("-1")
breakif
found: print(count)
