from math import log row, col = map(int, input().split(" ")) if row % 2 == 1:  print(row)else:  matrix = []  for _ in range(row):    matrix.append(input().split(" "))  minimum = row  for _ in range(int(log(row, 2))):    if matrix[0:minimum // 2] == matrix[minimum - 1:minimum // 2 - 1:-1]:      minimum //= 2    else:      break  print(minimum)