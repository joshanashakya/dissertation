t = int(input())
while (t > 0):    x1, y1, x2, y2 = map(int, input().split())
if x1 == x2:
    time = abs(y1 - y2)    elif y1 == y2:
    time = abs(x1 - x2)    else:
    time = abs(x1 - x2) + abs(y1 - y2) + 2
print(time)
t = t - 1
