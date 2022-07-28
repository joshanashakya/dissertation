n = int(input())l = list(input().split())d = {}for gar in l:  if gar in d:    d[gar] = d[gar] + 1  else:    d[gar] = 1  pari = 0  for gar in d:    pari = pari + d[gar] // 2print(pari // 2)
