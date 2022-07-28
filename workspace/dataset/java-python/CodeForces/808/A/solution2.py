def culc():    for i in range(10):        for j in range(1,10):            yield j * 10 ** i n = int(input()) for i in culc():    if i > n:        print(i - n)        break
