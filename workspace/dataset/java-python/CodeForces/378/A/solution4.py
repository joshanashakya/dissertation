n = [int(x) for x in input().split()]p1 = n[0]p2 = n[1]c1 = 0c2 = 0d = 0for i in range(1,7):    if p1 == p2:        d = 6        break    else:        if i == p2:            c2 += 1        elif i == p1:            c1 += 1        elif abs(i-p1) < abs(i-p2):            c1 += 1        elif abs(i-p1) > abs(i-p2):            c2 += 1        elif abs(i-p1) == abs(i-p2):            d += 1print(c1,d,c2)