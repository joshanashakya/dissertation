a1,a2,a3 = map(int,input().split())b1,b2,b3 = map(int,input().split())n = int(input())a = a1+a2+a3b = b1+b2+b3shells = 0if a%5 != 0:    shells+=a//5+1else:    shells+=a//5if b%10 != 0:    shells+=b//10+1else:    shells+=b//10#print(shells)if shells<=n:    print('YES')else:    print('NO')