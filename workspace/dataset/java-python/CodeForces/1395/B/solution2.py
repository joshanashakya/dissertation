n, m, x, y = map(int, input().split())
inix = x
iniy = y
while x < n + 1:
    print(x, y)
    x += 1
x = inix - 1
while x > 0:
    print(x, y)
    x -= 1
x = 1
y = 1
while y < iniy:
    if y % 2 == 1:
        while x < n + 1:
            print(x, y)
            x += 1
        y += 1
        x -= 1
    else:
        while x > 0:
            print(x, y)
            x -= 1
        y += 1
        x += 1
y += 1
while y < m + 1:
    if y % 2 == 0:
        while x < n + 1:
            print(x, y)
            x += 1
        y += 1
        x -= 1
    else:
        while x > 0:
            print(x, y)
            x -= 1
        y += 1
        x += 1
