def solve():    s = input()    x = [int(z) for z in s]    y, z = x[:3], x[3:]     if sum(y) < sum(z):        y, z = z, y     a = sum(y) - sum(z)     b = [y[-1], y[-2], y[-3], 9 - z[0], 9 - z[1], 9 - z[2]]    b.sort()     c = 0    cnt = 0    while c < a:        c += b.pop()        cnt += 1     return cnt print(solve())