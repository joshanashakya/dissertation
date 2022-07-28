counter = 0num = int(input())binary = input()for i in range(num):  if(binary[i] == '1'):    counter += 1  else:    breakif(num > counter + 1):  print(counter+1)else:  print(num)
