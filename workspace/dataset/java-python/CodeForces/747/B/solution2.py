n = int(input())genomes = list(input())if n % 4 != 0 or any([genomes.count(x) > n // 4 for x in 'ACGT']):  print('===')else:  cnt = {}  for x in 'ACGT':    cnt[x] = n // 4 - genomes.count(x)  for i in range(n):    if genomes[i] == '?':      for x in 'ACGT':        if cnt[x] > 0:          genomes[i] = x          cnt[x] -= 1          break  print(''.join(genomes))
