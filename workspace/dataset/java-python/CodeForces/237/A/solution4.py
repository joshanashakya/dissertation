count, prev, great_count = 1, -1, 0for i in range(int(input())):    h, m = map(int, input().split())     if h * 60 + m == prev:        count += 1    else:        prev = h * 60 + m        if count > great_count:            great_count = count        count = 1 print(max(great_count, count))