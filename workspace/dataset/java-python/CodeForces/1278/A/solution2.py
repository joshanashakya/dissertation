def pDash(p, h):    for i in p:        if i in h:            h = h.replace(i, '', 1)        else:            return False    return True  t = int(input())for _ in range(t):    p = input()    h = input()    temp = 0    for i in range(len(h) - len(p) + 1):        if pDash(p, h[i:i+len(p)]):            temp = 1            break    if temp == 1:        print("YES")    else:        print("NO")