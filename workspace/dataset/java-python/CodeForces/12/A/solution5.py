m = [] for i in range(3):    m.append(input())    if m[0] != m[2][::-1]: print('NO')else:     if(m[1][0] == m[1][2]):        print('YES')    else:        print('NO')    
