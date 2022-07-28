a = int(input())l = list(map(int, input().split()))c = 0k = 0for i in range(a):    c += l[i]    if c >= 0:                continue    else:        k += 1        c = 0 print(k)   
