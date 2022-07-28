n = int(input()) if n % 2 == 0:
    print(int(((n / 2) + 1) * ((n / 2) + 1)))else:
    print(int((2 + (n - 1) / 2) * (2 * ((n - 1) / 2 + 1))))
