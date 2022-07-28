t=int(input())for i in range(t):    n=input()    a=n[::-1]    s=[]    for i in range(len(n)):        if(a[i]!='0'):            s.append(a[i]+'0'*i)    print(len(s))    print(*s)
