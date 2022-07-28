x, y = map(int, input().split())
cnt = 0
while (True):    if
    (cnt % 2 == 0):
if (x >= 2 and y >= 2):            x -= 2
y -= 2
cnt += 1 elif (x >= 1 and y >= 12): x -= 1
y -= 12
cnt += 1 elif (y >= 22): y -= 22
cnt += 1 else:            break else:        if (y >= 22):            y -= 22
cnt += 1 elif (x >= 1 and y >= 12): x -= 1
y -= 12
cnt += 1 elif (x >= 2 and y >= 2): x -= 2
y -= 2
cnt += 1 else:            breakprint("Ciel" if cnt % 2 == 1 else "Hanako")
