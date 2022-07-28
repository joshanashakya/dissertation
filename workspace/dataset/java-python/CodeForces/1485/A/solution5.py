def calc(a, b):
    if (a == 1):        return 1e10
    i = 0
    while (b > 0):        b = b // a;        i += 1
    return i


for _ in range(int(input())):
    a, b = map(int, input().split());
    ans = 0
    while ((calc(b, a) - calc(b + 1, a)) >= 1):    b += 1;    ans += 1
    print(ans + calc(b, a))
