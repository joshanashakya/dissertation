n=input()if(len(n)%2==0):    c=n[len(n)//2-1]    s=n[:len(n)//2-1:]    s=s[::-1]    t=n[len(n)//2::]    x=min(len(s),len(t))    for i in range(x):        c=c+t[i]+s[i]    if(x==len(s)):        c=c+t[-1]    else:        c=c+s[-1]    print(c)else:    c=n[len(n)//2]    s=n[:len(n)//2:]    s=s[::-1]    t=n[len(n)//2+1::]    x=min(len(s),len(t))    for i in range(x):        c=c+t[i]+s[i]    print(c)
