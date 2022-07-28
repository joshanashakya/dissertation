n=int(input())l=list(map(int,input().split()))m=0for i in l:    p=m+i    m=max(m,p)    print(p,end=" ") 
