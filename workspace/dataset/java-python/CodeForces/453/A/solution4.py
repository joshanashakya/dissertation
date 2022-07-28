a, b = map(int, input().split())sum = 0for i in range(1, a + 1):    sum += i * ((i / a) ** b - ((i - 1) / a) ** b)print(sum)
