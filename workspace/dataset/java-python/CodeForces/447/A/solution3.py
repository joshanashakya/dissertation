p,n=map(int,input().split()) lst = [-1]*p res = -1for i in range(n):    x = int(input())    if 0 <= (x % p) <= p-1:        if lst[x % p] == -1:            lst[x % p] = x        elif lst[x % p] != -1:            res = i            break  print(res if res < 0 else res+1)
