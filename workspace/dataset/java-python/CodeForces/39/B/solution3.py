from sys import stdin, stdout  years = int(input()) incomes = list(map(int,list(stdin.readline().split(' ')))) respuestas = list()cnt = 1  for x in range(years):    if incomes[x] == cnt:        respuestas.append(str(2000+x+1))        cnt+=1print(len(respuestas))if respuestas:    print(' '.join(respuestas))