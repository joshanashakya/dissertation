s = input().split()x = int(s[0])if s[-1] == 'month':    if x == 31:        print(7)    elif x == 30:        print(11)    else:        print(12)else:     print(52 if (x < 5 or x > 6) else 53)
