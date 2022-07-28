n = int(input())r = 1; c = 1for i in range(n):    s = input()    if (len(s) == 4):        r += 1; c += 1    elif(s == "UL" or s == "DR"):        r += 1    else:        c += 1print(r * c)
