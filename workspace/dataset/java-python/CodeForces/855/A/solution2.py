i = int(input())l = []res = []while i > 0:    a = input()    i -= 1    if a in l:        res.append('YES')    else:        l.append(a)        res.append('NO') for e in res:    print(e)
