for T in range(int(input())):    s = list(input())    if not ('0' in s):        print("cyan")        continue    m=0    s.remove('0')    for j in s:        if int(j)&1 == 0:            break    else:        print("cyan")        continue        for i in s:        m+= int(i)    if(m%3 == 0):        print("red")    else:        print("cyan")
