k = 0a = input()b = input()while k < min(len(a), len(b)) and a[len(a) - k - 1] == b[len(b) - k - 1]:    k += 1 print(len(a) - k + len(b) - k)
