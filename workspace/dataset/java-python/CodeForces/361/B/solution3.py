import mathdef main():    n,k = map(int,input().split())    if n==k or n==k-1:        print("-1")        exit()    if n==k+1:        for i in range(n):            print(i+1,end=" ")        exit()    if n==k+2:        print(n,end=" ")        for i in range(n-2):            print(i+2,end=" ")        print(1)        exit()    l=[]    for i in range(k+1):        l.append(i+1)    for i in range(k+1,n-1):        l.append(i+2)    if math.gcd(10000,k+2)>1:        l.append(1)        l[0]=k+2    else:        l.append(k+2)    print(*l)if __name__ == '__main__':    main()
