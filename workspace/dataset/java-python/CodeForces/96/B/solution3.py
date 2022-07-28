a = []


def f(n, x):
    if x <= 1e11:
        if x >= n and str(x).count('4') == str(x).count('7'):
            a.append(x)
        f(n, 10 * x + 4)
        f(n, 10 * x + 7)


f(int(input()), 0)
a.sort()
print(a[0])
