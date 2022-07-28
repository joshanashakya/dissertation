n = int(input())poles = []for _ in range(n):    poles.append(input())num_groups = 1for i in range(n-1):    if not int(poles[i][1]) ^ int(poles[i+1][0]):        num_groups += 1print(num_groups)
