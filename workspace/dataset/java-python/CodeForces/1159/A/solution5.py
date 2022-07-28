n=int(input())a=0m=0   i=n-1  s=str(input())while(i>=0):    if s[i]=='+':        m+=1    else:        m-=1    a=max(a,m)    i-=1print(a)             
