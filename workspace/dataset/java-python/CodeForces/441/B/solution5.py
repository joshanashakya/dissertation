n, v = [int(x) for x in input().split(' ')]a_dict = {}m = 0p = 0for tree in range(n):    a, b = [int(x) for x in input().split(' ')]    m = max(a, m)    if a in a_dict.keys():        a_dict[a] += b    else:        a_dict[a] = b for day in range(m + 2):    if day not in a_dict.keys():        a_dict[day] = 0  for day in range(1, m + 2):     y = min(v, a_dict[day - 1])    a_dict[day - 1] -= y    z = min(v - y, a_dict[day])    a_dict[day] -= z     p += z + y print(p)