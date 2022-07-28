n = int(input())c = (n // 7)*2r = n % 7 if r == 0:  print(c,c)elif r == 1:  print(c,c+1)  elif r >= 2 and r < 6:  print(c,c+2)  else:  print(c+1,c+2)  
