# cook your dish heres=input()i=0c1,c2,c3=0,0,0while i <len(s):    if s[i]=='A' or s[i]=='B':        c=s[i]        l=0        while s[i]==c:            i=i+1            l=l+1            c='A' if c=='B' else 'B'            if i==len(s):                break        if l==2:            if c=='A':                c1+=1            else:                c2+=1        elif l==3 or l==4:            c3+=1        elif l>4:            c1=1            c2=1            break    else:        i=i+1if c1 and c2:    print('YES')else:    if c1 or c2:        if c3:            print('YES')        else:            print('NO')    else:        if c3>=2:            print('YES')        else:            print('NO')