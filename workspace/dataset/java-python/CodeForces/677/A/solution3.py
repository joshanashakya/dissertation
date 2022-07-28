n, h = map(int, input().split())a = input().split()sum = 0for i in a:    if int(i) > h:        sum += 2    else:        sum += 1print(sum)
