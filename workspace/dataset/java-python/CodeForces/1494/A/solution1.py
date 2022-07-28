for _ in range(int(input())):    s = input()
x1, x2, x3 = 0, 0, 0
c1, c2, c3 = True, True, True
nc1, nc2, nc3 = True, True, True
for i in s:        if
i == 'A': x1 += 1 elif i == 'B': x2 += 1 elif i == 'C': x3 += 1         c3 = c3 & (x1 + x2 >= x3)
c2 = c2 & (x1 + x3 >= x2)
c1 = c1 & (x2 + x3 >= x1)
nc3 = nc3 & (x1 + x2 <= x3)
nc2 = nc2 & (x1 + x3 <= x2)
nc1 = nc1 & (x2 + x3 <= x1)
if x1 + x2 == x3:        if
c3: print("YES") elif nc3: print("YES") else:            print("NO")  elif x1 + x3 == x2:
if c2:
    print("YES")        elif nc2:
    print("YES")        else:
    print("NO")  elif x2 + x3 == x1:
if c1:
    print("YES")        elif nc1:
    print("YES")        else:
    print("NO") else:        print("NO") 
