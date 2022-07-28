from collections import defaultdictfrom

math
import inf n, m, x = list(map(int, input().split()))
keyboard, shift = [], set()
for i in range(n):    ip = input()
line = [x for x in ip]
for j in range(m):        if
ip[j] == 'S': shift.add((i, j))
keyboard.append(line) q = int(input())
text = input()   # distance of each lettersdistance = defaultdict(lambda: inf)reachable = set()for i in range(n):    for j in range(m):        letter = keyboard[i][j]        if letter == 'S':            continue        upper = letter.upper()        reachable.add(letter)        if shift:            reachable.add(upper)        for sh in shift:            a, b = sh            distance[upper] = min(distance[upper], (i - a)**2 + (j - b)**2) # letters reachable using one handusing_one_hand = set()for i in range(n):    for j in range(m):        letter = keyboard[i][j]        if letter == 'S':            continue        upper = letter.upper()        using_one_hand.add(letter)        if distance[upper] <= x * x:            using_one_hand.add(upper) ans = 0for letter in text:    if letter not in reachable:        ans = -1        break    else:        if letter not in using_one_hand:            ans += 1print(ans)
