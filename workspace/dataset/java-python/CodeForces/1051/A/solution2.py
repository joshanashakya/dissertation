def solve(s):    f1=False    f2=False    f3=False    for i in range(len(s)):        s1=s[i]        if s1.isupper():            f1=True        if s1.islower():            f2=True        if s1.isdigit():            f3=True        if f1 and f2 and f3:            break    if f1 and f2 and f3:        return True    else:        return Falsefor _ in range(int(input())):    s=input()    if solve(s):        print(s)    else:        f=True        t=list(s)        for i in range(len(t)):            z=t[i]            t[i]='1'            if solve(''.join(map(str,t))):                print(''.join(map(str,t)))                f=False                break            t[i]='a'            if solve(''.join(map(str,t))):                print(''.join(map(str,t)))                f=False                break            t[i]='A'            if solve(''.join(map(str,t))):                print(''.join(map(str,t)))                f=False                break            t[i]=z        if f:            if s[2].isupper():                print('a1'+s[2:])                continue            if s[2].islower():                print('A1'+s[2:])                continue            if s[2].isdigit():                print('aA'+s[2:])                continue
