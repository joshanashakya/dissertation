st=input()l=len(st)st1=input()l1=len(st1)i=0c=0while(i<=l-l1):    st2=st[i:i+l1]    if(st1==st2):        c=c+1        i=i+l1    else:        i=i+1print(c)
