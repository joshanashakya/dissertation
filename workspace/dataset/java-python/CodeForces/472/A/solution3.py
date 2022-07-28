n = int(input())for i in range(4, n - 3):    if i % 2 == 0 and ((n - i) % 3 == 0 or (n - i % 2 == 0)):        a = i        b = n - i        breakprint(a, b)
