n , x = map(int , input().split()) r = lambda : list(map(int, input().split()))arr = [r() for _ in range(n)]   t = 1watch = 0i = 0while 1:    while t + x <= arr[i][0]: t+=x    # print(t)    watch += arr[i][1] - t + 1    t = arr[i][1] + 1    i+=1     if i==n: break print(watch)  
