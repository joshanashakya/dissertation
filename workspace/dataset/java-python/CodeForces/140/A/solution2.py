import math  def solve():     n, R, r = [int(x) for x in input().split(' ')]    e = 10 ** (-7)     if n == 1:        return r <= R    elif n == 2:        return 2 * r <= R    else:        return r < (R - r) * math.sin(math.pi / n) + e  if solve():    print("YES")else:    print("NO") 
