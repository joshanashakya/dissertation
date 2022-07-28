r, g, b = map(int, input().split())
x = 0
while True:    if
r > 0: r -= 2
r = max(0, r)
if r == g and g == b and g == 0: break
x += 1 else:x += 1
if g > 0:        g -= 2
g = max(0, g)
if r == g and g == b and g == 0: break
x += 1 else:x += 1
if b > 0:        b -= 2
b = max(0, b)
if r == g and g == b and g == 0: break
x += 1 else:x += 1
print(x + 30)
