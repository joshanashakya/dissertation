n=int(input())a=[]for i in range(n):    s=input()    s+=input()[::-1]    if i!=n-1:input()    add=True    for x in a:        if s in x:            add=False            break    if add: a.append(s+s)print(len(a))                