a, b, c, d, e, f = [int(i) for i in input().split()] if a * c * e < b * d * f or (c == 0 and d > 0) or (
        a == 0 and b > 0 and d > 0):
    print('Ron')else:
    print('Hermione')
