a1,b1,c1 = [int(x) for x in input().split()]a2,b2,c2 = [int(x) for x in input().split()] alwaysGood = FalsealwaysBad = False if a1 == 0 and b1 == 0:    if c1 == 0:        alwaysGood = True    else:        alwaysBad = Trueif a2 == 0 and b2 == 0:    if c2 == 0:        alwaysGood = True    else:        alwaysBad = True if alwaysBad:    print(0)elif alwaysGood:    print(-1)else:    if a1*b2 == a2*b1:        if a1 != 0:            c1 *= a2            c2 *= a1        else:            c1 *= b2            c2 *= b1        if c1 == c2:            print(-1)        else:            print(0)    else:        print(1)
