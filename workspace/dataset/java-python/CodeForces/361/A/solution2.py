n,k=map(int,input().split())a=k-n+1for i in range(n):    for j in range(n):        if i==j:            print(a,end=" ")        else:            print(1,end=" ")    print("")
