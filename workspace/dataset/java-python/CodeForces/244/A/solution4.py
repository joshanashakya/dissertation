n , k = map(int , input().split()) r = lambda : list(map(int, input().split()))arr = r() num = 1 for i in arr:    print(i , end = " ")    lim = n-1    while lim:        if num not in arr:            print(num , end= " ")             lim -= 1        num+=1      print()  