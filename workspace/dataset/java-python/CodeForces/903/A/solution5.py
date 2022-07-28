n=int(input())for i in range(n):    a=int(input())    a-=(a%3)*7    if a<0:        print('NO')    else:        print('YES')
