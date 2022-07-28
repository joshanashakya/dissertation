from math import prod for test in range(int(input())):    n = int(input())
lst = sorted(list(map(int, input().strip().split())),
             reverse=True)  # print(lst)    if lst[0] == 0:        print(0)    elif lst[0] < 0:        print(prod(lst[:5]))    else:        a = prod(lst[0:1] + lst[n - 4:n])        b = prod(lst[0:3] + lst[n - 2:n])        c = prod(lst[0:5])        # print(a, b, c)        print(max(a, b, c))
