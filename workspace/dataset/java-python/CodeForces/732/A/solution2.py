x, y = map(int, input().split())n = 0b = Truewhile b:    n+=1    if (n*x-y) % 10 == 0 or n*x % 10 ==0:        b = Falseprint(n)
