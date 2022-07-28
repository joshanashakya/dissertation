n = int(input())b = list(map(int, input(). split()))k = 0for i in range(1, n - 1):    if b[i] == 0 and b[i + 1] == 1 and b[i - 1] == 1:        b[i + 1] = 0        k += 1print(k)
