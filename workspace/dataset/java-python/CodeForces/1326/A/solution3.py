def func(s):    for i in range(s):        n = int(input())        if n == 1:            print('-1')        else:            ans = '2' + ('3'* (n-1))            print(ans) s = int(input())func(s)
