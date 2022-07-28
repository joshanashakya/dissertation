n = int(input()) i = 0 if n % 2 == 0:    print(n // 2)    for i in range(n//2):        print(2, end = " ")else:    print(n // 2)    for i in range(n//2-1):        print(2, end = " ")    print(3)
