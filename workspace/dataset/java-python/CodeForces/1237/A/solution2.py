m = 1for _ in range(int(input())):    n = int(input())    if n % 2 == 0:        print(n//2)    else:        print(n//2+m)        m = 1-m
