for i in range(int(input())):    a,b,n=map(int,input().split(' '))    g=[a,b,a^b]    print(g[n%3])  
