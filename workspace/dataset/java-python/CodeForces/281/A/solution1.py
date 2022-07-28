dc=input()t=dc.istitle()if t:    print(dc)else:    s=list(dc)    b=s.pop(0)    b=b.upper()    s.insert(0,b)    print(''.join(s))
