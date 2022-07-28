temp = [int(x) for x in input().split()]y = temp[0]b = temp[1]r = temp[2]if y >= b:    y = b-1else:    b = y+1if b >= r:    b = r-1    y = r-2else:    r = b+1print(y+b+r)
