n=int(input())m=int(input()) if n-m==1 or n-m==-1:    print(1)else:    i=1    s=0    while(n!=m):        if n>m:            n-=1            s+=i            if n==m:                break            m+=1            s+=i        else:            n+=1             s+=i            if n==m:                break            m-=1             s+=i        i+=1    print(s)