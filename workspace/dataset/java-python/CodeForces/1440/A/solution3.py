# if c0+h<c1 sub all 1 with 0# if c1+h<c2 sub all 0 with 1t = int(input())for i in range(t):    n, c0, c1, h = [int(x) for x in input().split()]    b = input()    all0, all1 = False, False    count0, count1 = 0, 0    for i in b:        if i == '1':            count1 += 1        else:            count0 += 1    if c0+h < c1:        all0 = True    elif c1+h < c0:        all1 = True    if all1:        print(h*count0+n*(c1))    elif all0:        print(h*count1+n*(c0))    else:        s = 0        for i in b:            if i == '1':                s += c1            else:                s += c0        print(s)