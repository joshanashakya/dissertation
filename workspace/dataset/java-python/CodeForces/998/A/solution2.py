n = int(input())a = list(map(int, input().split()))g = d = 0lst = []for i in range(n):    if i%2 == 0:        g += a[i]        lst.append(a[i])    else :        d += a[i]if d > 0 and g > 0 and g != d:    print(1)    print(2)elif g == d and n > 2:    print(1)    print(1)else :    print(-1)