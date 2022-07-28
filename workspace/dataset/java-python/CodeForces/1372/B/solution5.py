for _ in range(int(input())):    n=int(input())    p=0    for i in range(2,int(n**0.5)+1):        if n%i==0:            p=i            break    if p==0:p=n    print(n//p,n-(n//p)) 
