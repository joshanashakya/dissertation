n = int(input())f = [1] + list(map(int,input().split()))for i in range(1,n+1):  if f[f[f[i]]] == i:     print('Yes')    breakelse: print('No')
