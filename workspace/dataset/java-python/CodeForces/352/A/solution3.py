import mathn = int(input())l = list(map(int, input().split()))c5 = l.count(5)cc = math.floor(c5/9)c0 = l.count(0)if c0 == 0:    print(-1)else:    if cc == 0:        print(0)    else:        a = '5'*(9*cc) + '0'*c0        print(a)
