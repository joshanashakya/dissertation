c,v0,v1,a,l = list(map(int, input().split()))ans = 0tmp = 0 fa = 0while True:    temp = (v0 + (fa * a))    if (temp >= v1):        tmp += v1    else:        tmp += temp    ans += 1    if (tmp >= c):        break    fa += 1    tmp -= l#     print(tmp)print(ans)    