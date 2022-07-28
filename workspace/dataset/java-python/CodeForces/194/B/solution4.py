input()a = [int(x) for x in input().split()]for n in a:    i = 1    while i * n * (n + 1) % (n * 4) != 0:        i += 1    print(i * n + 1)
