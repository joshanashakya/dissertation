temp = [int(x) for x in input().split()]n = temp[0]m = temp[1]result = 0for i in range(n):    a = [int(x) for x in input().split()]    for j in range(m):        if a[2*j-2] == 1 or a[2*j-1] == 1:            result += 1print(result)