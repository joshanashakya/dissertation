n,m=[int(x) for x in input().split()]n-=1for i in range(n+1):    print('0 '*i+str(m)+' 0'*(n-i))
