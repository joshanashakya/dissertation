s = input().split()n = int(s[0])m = int(s[1])k = int(s[2])if k % 2 == 0:    k = int(k / 2)    a = int(k / m)    b = k % m    if b != 0:        print(a+1, b, 'R')    else:        print(a, m, 'R')else:    k = int((k +1) / 2)    a = int(k / m)    b = k % m    if b != 0:        print(a+1, b, 'L')    else:        print(a, m, 'L')          