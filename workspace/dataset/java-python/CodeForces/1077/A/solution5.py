for _ in range(int(input())):    a,b,k=map(int,input().split())    c=a*(k//2)    c-=b*(k//2)    if k%2: c+=a    print(c)
