n = int(input())n = n*2k = 0f=Falsefor i in range(1,int(n**0.5)):    n1 = n - i*(i+1)    k = int(n1**0.5)    if k*(k+1) == n1 and k!=0:        print('YES')        f = True        breakif f == False:    print('NO')
