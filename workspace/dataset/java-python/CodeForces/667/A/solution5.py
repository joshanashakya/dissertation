s = input().split()pi = 3.141592653589for i in range(4):    s[i] = float(s[i])    if s[2]/(pi*((s[0]/2)**2))<=s[3]:    print('NO')else:    print('YES')    print(s[1]/(s[2]/(pi*((s[0]/2)**2))-s[3]))
