n = int(input())colors = list(input()) count = 0prev = '' for i in colors:    if prev == i:        count += 1     prev = i print(count)
