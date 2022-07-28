input()#arr = [int(x) for x in input().split()][::-1]x = []for elem in [int(x) for x in input().split()][::-1]:    if elem not in x:        x.append(elem)print(len(x))print(*x[::-1])
