test_number = int(input()) for i in range(test_number):    dishes = sorted(list(map(int, input().split())), reverse= True)     visitor = 0     for i in range(len(dishes)):        if dishes[i] > 0:            dishes[i] -= 1            visitor += 1     for j in range(2):        for i in range(1, 3):            if dishes[j] > 0 and dishes[i] > 0 and i > j:                dishes[j] -= 1                dishes[i] -= 1                visitor += 1            if dishes[0] > 0 and dishes[1] > 0 and dishes[2] > 0:        visitor += 1     print(visitor)
