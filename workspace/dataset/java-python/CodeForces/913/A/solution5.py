n = int(input())m = int(input())x = 1for i in range(0, n):    x*=2    if x > m:        breakprint(m%x)
