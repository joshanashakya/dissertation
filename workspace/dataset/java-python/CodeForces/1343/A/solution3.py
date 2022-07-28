for _ in range(int(input())):    n = int(input())    k = 3    while n % k > 0:        k = k*2 + 1    print(n//k)
