n = int(input())for _ in range(n):    li = list(input())    k = len(li)    res = []    st = False    tmp = 1    for i in range(k):        if i == 0:            res.append(li[i])            continue        if res[-1] != li[i]:            if st == True and tmp % 2 == 0:                while tmp > 0:                    res.pop()                    tmp -= 1                st = False                tmp = 1            else:                tmp = 1            res.append(li[i])        else:            st = True            tmp += 1            res.append(li[i])    if st == True and tmp%2 == 0:        while tmp > 0:            res.pop()            tmp -= 1    res = list(set(res))    res.sort()    print(*res,sep = '')