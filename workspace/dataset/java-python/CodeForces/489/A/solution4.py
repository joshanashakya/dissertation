n=int(input())l = list(map(int, input().split()))p = l.copy()p.sort()print(n) for i in range(n):    j=l[i:].index(p[i])+i    print(i,j)    l[i],l[j]=l[j],l[i]    
