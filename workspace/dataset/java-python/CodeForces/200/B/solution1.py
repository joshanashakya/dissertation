n = int(input())p = list(map(int,input().split(' ')))def drinks(n,p):    x = 0    for e in p:        x += e / 100    return (x / n) * 100print("{:.12f}".format(drinks(n,p)))
