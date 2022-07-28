for _ in range(int(input())):  a = ((input()))
b = str(a[0])
b = int(b)
if len(a) == 1:
    print((b - 1) * 10 + 1)  elif len(a) == 2:
    print((b - 1) * 10 + 3)  elif len(a) == 3:
    print((b - 1) * 10 + 6)  else:
    print(b * 10)
