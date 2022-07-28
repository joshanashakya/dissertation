n = int(input())k = list(map(int,input().split())) for i in range(n):    if((k[i]-k[0])%2):        k.sort()        breakprint(*k)
