lines = input()info = [int(x) for x in input().split()]temp = [info[0]]amazing = 0for i in range(1, len(info)):    temp.append(info[i])    if info[i] == min(temp) and temp.count(info[i]) == 1:        amazing += 1    if info[i] == max(temp) and temp.count(info[i]) == 1:        amazing += 1    else:        continue print(amazing) 
