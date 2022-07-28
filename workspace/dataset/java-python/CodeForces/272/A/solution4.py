n = int(input()) + 1fingers = sum(map(int, input().split()))start = fingers % noptions = 0for x in range(1,6):    if (start + x) % n != 1:        options += 1print(options)
