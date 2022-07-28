a, b, c = map(int, input().split())summ = (a + b + c)// 2if a > b + c or b > a + c or c > a + b or (a + b + c) % 2:    print("Impossible")    exit(0)print(summ - c, summ - a, summ - b)
