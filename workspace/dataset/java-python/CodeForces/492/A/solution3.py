n = int(input())k = 0c = 0for i in range(1, 10001):    k += i    c += k    if c == n:        print(i)        break    if c >= n:        print(i-1)        break 
