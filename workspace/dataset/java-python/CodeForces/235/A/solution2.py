n = int(input())if n <= 2:    print(n)elif n % 2 != 0:    print(n*(n-1)*(n-2))elif n % 2 == 0:    if n % 3 == 0:        print((n-1)*(n-2)*(n-3))    else:        print(n*(n-1)*(n-3))  
