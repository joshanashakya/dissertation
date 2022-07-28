n = int(input())
if (n % 2 == 0):
    print(int((n / 2 + 1) ** 2))else:
    n = (n + 1) / 2
print(int(4 + ((n - 1) * (2 * 8 + (n - 2) * 4)) / 2))
