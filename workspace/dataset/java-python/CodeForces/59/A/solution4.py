s1 = input() lowers = 0u
ppers = 0 for c in s1:    if
c.isupper(): uppers += 1 else:        lowers += 1 if lowers < uppers:
    print(s1.upper())else:
    print(s1.lower()) 
