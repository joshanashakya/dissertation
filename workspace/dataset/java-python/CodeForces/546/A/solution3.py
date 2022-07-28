a, b, c = list(map(int, input().split(" ")))total = int(a*c*(c+1)*1/2)if (total-b)<0:    print(0)else:    print(total-b)
