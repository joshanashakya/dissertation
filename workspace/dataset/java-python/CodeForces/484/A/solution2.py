n = int(input()) def count(num):    ct = 0    for i in range(len(num)):        if num[i:i+1] == '1':            ct += 1            return ct for i in range(n):    line = input().split()    a = int(line[0])    b = int(line[1])    if a == b:        print(a)        continue     l = bin(a)[2::]    u = bin(b)[2::]     while len(l) < 60:        l = '0' + l    while len(u) < 60:        u = '0' + u        start = '1' * 60     end =""    for j in range(59):        charL = l[j:j+1]        charU = u[j:j+1]         if charL == charU and charL == '0':            end += '0'            continue                if charL != charU:            end += '0' + start[j+1::]            break        end += '1'        #print(l)    #print(u)    #print(start)    if(count(u) > count(end)):        print(b)    else:        print(int(end, 2))    #print()