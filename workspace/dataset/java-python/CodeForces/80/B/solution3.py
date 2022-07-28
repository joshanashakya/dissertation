h, m = map(int, input().split(':'))
if (h >= 12):    h -= 12
print(h * 30 + 30 * m / 60, m * 6)
