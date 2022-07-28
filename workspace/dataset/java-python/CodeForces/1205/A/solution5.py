n=int(input()) if n%2:    print("YES")    ls=[0]*2*n    c=1    i=-1    while c<=2*n:        i=i+1        ls[i]=c        i=(i+n)%(2*n)        ls[i]=c+1        c=c+2    print(*ls)else:    print("NO")
