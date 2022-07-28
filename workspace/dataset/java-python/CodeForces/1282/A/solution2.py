for _ in [0]*int(input()):    a, b, c, r = map(int, input().split())    if a > b:a, b = b, a    print(min(b-a,max(c-r-a, 0)+max(b-c-r, 0)))
