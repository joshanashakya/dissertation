temp = [int(x) for x in input().split()]a = temp[0]b = temp[1]c = temp[2]x = a + cy = b + cif a > b:    print(2*c+2*b+1)elif b > a:    print(2*c+2*a+1)else:    print(2*c+2*a)
