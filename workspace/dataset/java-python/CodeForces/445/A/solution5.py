import sysdef get_ints(): return map(int, sys.stdin.readline().strip().split())def get_ints_lists(): return list(map(int, sys.stdin.readline().strip().split()))def get_string(): return sys.stdin.readline().strip()n,m=get_ints()for j in range(n):    s=get_string()    w="W"    b="B"    c="-"    if j%2==0:        if m==1:            if s[0]==".":                print(b)            else:                print(c)        else:            for i in range(m):                if s[i]==c:                    print(c,end="")                else:                    if i%2==0:                        print(b,end="")                    else:                        print(w,end="")        print()    elif j%2==1:        if m==1:            if s[0]==".":                print(w)            else:                print(c)        else:            for i in range(m):                if s[i]==c:                    print(c,end="")                else:                    if i%2==0:                        print(w,end="")                    else:                        print(b,end="")        print()
