file = open('input.txt', 'r')n = int(file.readline()) - 1lis = sorted(list(map(int, file.readline().split())))i, j = 0, 0for i in range(n + 1):    if lis[i] <= lis[j] * 2:        continue    j += 1out = n - i + jprint(out)open("output.txt", "w").write(str(out))