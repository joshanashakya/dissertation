n = int(input())black = []count = 0 for i in input():    if i == 'B':        count += 1    else:        if not count == 0:            black.append(count)            count = 0 if not count == 0:    black.append(count) print(len(black))print(*black)
