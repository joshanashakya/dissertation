a, b, c = map(int, input().split()) sums = [1] + [0 for i in range(c)]for var in (a, b):  for i in range(c - var + 1):    sums[i + var] += sums[i] print("Yes") if sums[c] else print("No")
