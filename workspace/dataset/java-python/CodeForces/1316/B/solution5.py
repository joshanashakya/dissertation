for _ in range(int(input())):    n=int(input())    s=input()    k=1    z=''    a=[s]    b=[]    while k<n:        z=s[k:n]        if n%2==k%2:            z+=s[0:k]        else:            z+=s[0:k][::-1]        a.append(z)        b.append(k)        k+=1    print(min(a))    try:        print(b[a.index(min(a))])    except IndexError:        print(n)        
