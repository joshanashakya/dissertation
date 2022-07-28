n, s = open(0);
print(min(
    sum(abs(x - c ** i) for i, x in enumerate(sorted(map(int, s.split())))) for c in range(2 + 9 ** 6 // int(n) ** 2)))
