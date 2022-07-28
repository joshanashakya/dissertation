k, r = map(int, input().split(" "))i, m = 1, kwhile m % 10 != r and m % 10 != 0:    i += 1    m = k * iprint(i)
