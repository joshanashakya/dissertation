from sys import stdin def firstDiv(n) :     # Corner cases     if (n <= 1) :         return False    if (n <= 3) :         return 2    # This is checked so that we can skip      # middle five numbers in below loop     if n % 2 == 0:        return 2    elif n % 3 == 0:         return 3       i = 5    while(i * i <= n) :         if n % i == 0:            return i        elif n % (i + 2) == 0:             return i + 2        i = i + 6       return 10e9 + 1  # print all prime numbers  # less than equal to N  def sol(n, p):     for i in range(n, p, -1):         f = firstDiv(i)        #print(i, f)        if f > p:            print(i)            return    print(-1)     p, y = list(map(int, stdin.readline().rstrip().split(" ")))sol(y, p)  