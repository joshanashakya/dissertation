prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 ]c = 0print(4)s = input()if s=="yes":    c = c +1print(9)s = input()if s=="yes":    c = c +1print(25)s = input()if s=="yes":    c = c +1print(49)s = input()if s=="yes":    c = c +1 for i in prime:    print(i)    s = input()    if s=="yes":        c = c+1    if c>1:        print("composite")        exit()print("prime")