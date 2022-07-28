temp = [int(x) for x in input().split()]
n = temp[0]
m = temp[1]
m = m % (n * (n + 1) // 2)
x = int((-1 + (1 + 8 * m) ** (1 / 2)) // 2)
print(m - x * (x + 1) // 2)
