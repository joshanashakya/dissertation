t = int(input())
for i in range(t):    n, c0, c1, h = input().split(' ')
n, c0, c1, h = int(n), int(c0), int(c1), int(h)
digits = input()
digit0 = digits.count('0')
digit1 = n - digit0
if (h >= c0 and h >= c1):
    print(digit0 * c0 + digit1 * c1)            elif (c0 <= h and c1 > h):
    if
(c0 + h < c1): print(digit0 * c0 + digit1 * (c0 + h)) else:            print(digit0 * c0 + digit1 * c1) elif (
            c0 > h and c1 <= h):
if (c1 + h < c0):
    print(digit0 * (c1 + h) + digit1 * c1)        else:
    print(digit0 * c0 + digit1 * c1) else:        if (c1 < c0 and (c1 + h) < c0):
    print(digit0 * (h + c1) + digit1 * c1)        elif (c0 < c1 and (c0 + h) < c1):
    print(digit0 * c0 + digit1 * (h + c0))        else:
    print(digit0 * c0 + digit1 * c1)
