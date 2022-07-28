n, b = map(int, input().split())s = list(map(int, input().split()))sb = sum(s) + bsb /= nif sb - max(s) >= 0:    for x in s:        print(sb-x)else:    print('-1')  
