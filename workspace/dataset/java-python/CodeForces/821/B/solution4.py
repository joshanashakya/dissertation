 def get(i, j):    return (i + 1) * (j + 1) * (i + j) // 2  m, b = map(int, input().split())res = -1for y in range(b):    x = (b - y) * m    res = max(get(x, y), res)print(res)
