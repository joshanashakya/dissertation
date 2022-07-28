n, x1, y1, x2, y2 = map(int, input().split())
if ((y1 >= x1 and y2 >= x2) or (y1 < x1 and y2 < x2)):
    ans = abs(x1 + y1 - x2 - y2)else:
    dis = x1 + x2 + y1 + y2
if (dis < 2 * n):
    ans = dis    else:
    ans = 4 * n - disprint(ans)
