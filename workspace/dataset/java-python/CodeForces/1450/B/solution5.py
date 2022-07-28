def is_ok(points):  


for i in range(len(points)):        poss = True
for j in range(len(points)):            if
abs(points[i][0] - points[j][0]) + abs(points[i][1] - points[j][
    1]) > k:  # print(points[i], points[j])                poss = False                break        if poss:            return 1     if poss:        return 1    else:        return -1  for t in range(int(input())):    n, k = map(int, input().split())    points = []    for i in range(n):        x, y = map(int, input().split())        points.append([x, y])    # print(points)    print(is_ok(points))
