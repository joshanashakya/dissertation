t = int(input())s = input()if s.count('4') + s.count('7') != t:    print('NO')else:    one = 0    two = 0    n = int(t / 2)    q = s[:n]    w = s[n:]    for i in q:        one += int(i)    for i in w:        two += int(i)        if one == two:        print('YES')    else:        print('NO')
