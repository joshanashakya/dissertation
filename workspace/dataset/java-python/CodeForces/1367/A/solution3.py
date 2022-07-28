for _ in range(int(input())):    b = input()    a = b[0:2]    c = 0    for i in b[3:]:        if c:            a += i        c = 1 - c    if len(b) > 2:        a += b[-1]    print(a)
