n=int(input())s=input()a=list(s)i=0c=0while i<n-1:    if a[i]=='U' and a[i+1]=='R':        c=c+1        a[i]='D'        a[i+1]='D'    elif a[i]=='R'and a[i+1]=='U':        a[i]='D'        a[i+1]='D'        c=c+1    i=i+1print(n-c)