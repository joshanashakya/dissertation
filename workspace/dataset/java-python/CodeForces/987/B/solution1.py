import math x, y = map(int, input().split())c1, c2 = math.log(x) / x, math.log(y) / y print('<' if c1 < c2 else '>' if c1 > c2 else '=')
