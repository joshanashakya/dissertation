n = [int(x) for x in input().split()]t = n[1]j = []for i in range(n[0]):    x = [int(x) for x in input().split()]    if x[1] > t:        j.append((x[0]-(x[1]-t)))    else:        j.append(x[0]) print(max(j))
