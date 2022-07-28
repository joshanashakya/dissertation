n, m = map(int, input().split())a = nb = mwhile a*b > 0:    if a >= 2*b:        a = a%(2*b)    elif b >= 2*a:        b = b%(2*a)    else :        breakprint(a, b)
