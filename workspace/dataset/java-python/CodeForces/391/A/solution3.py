import math  def split(word):     return [char for char in word] fin = input() gene = split(fin)n = len(gene) max = []counter = 1  for i in range(1, n):    if gene[i] == gene[i-1]:        counter += 1    else:            max.append(counter)         counter =1    max.append(counter)  answer = 0 for i in range(0, len(max) ):     if max[i] %2 == 0:             answer += 1    else:         answer += 0  print(answer) 