n = int(input())l = list(map(int, input().split()))ce = 0co = 0s = 0for i in l:    if i % 2 == 0:        ce += 1    else:        co += 1    s += i if s % 2 == 0:    print(ce)else:    print(co)
