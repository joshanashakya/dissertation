n = int(input())L = list(map(int, input().split())) imos = [0]*(n+1)for i, l in enumerate(L):    imos[max(i-l, 0)] += 1    imos[i] -= 1from itertools import accumulateimos = list(accumulate(imos))#print(imos)cnt = 0for i in range(n):    if imos[i] > 0:        cnt += 1print(n-cnt)
