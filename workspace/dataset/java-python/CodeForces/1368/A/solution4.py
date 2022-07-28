for _ in range(int(input())):    a,b,n = [int(x) for x in input().split()]    i = 0    while a<=n and b<=n:        if a<b:            a+=b        else:            b+=a        i+=1    print(i)
