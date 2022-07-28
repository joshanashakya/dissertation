h, m = map(float, input().split(":"))
if h > 12:    h -= 12
rh = h * 30
rh += m / 2
rm = m * 6
rh %= 360
rm %= 360
if int(rh) == rh:    rh = int(rh)
if int(rm) == rm:    rm = int(rm)
print((rh), (rm))
