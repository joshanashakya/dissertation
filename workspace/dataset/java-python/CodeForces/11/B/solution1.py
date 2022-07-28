x = abs(int(input()))k, s, i = 0, 0, 1while s < x or (s - x) % 2 == 1:    s += i    i += 1print(i - 1)
