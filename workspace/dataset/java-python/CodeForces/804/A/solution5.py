n = int(input())if n == 1:    print("0")elif n % 2 == 0:    print(n // 2 - 1)else:    print((n // 2 - 1) + ((n // 2 + 1) + (n + 1) // 2) % n)
