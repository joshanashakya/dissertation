n = int(input())v_arr = list(map(int, input().split(" ")))u_arr = v_arr.copy()u_arr.sort()m = int(input()) def sum_calc(arr):    sum_ = 0    sum_arr = [0]    for item in arr:        sum_ += item        sum_arr.append(sum_)    return sum_arr sum_v = sum_calc(v_arr)sum_u = sum_calc(u_arr)for i in range(m):    inp = list(map(int, input().split(" ")))    _type = inp[0]    l = inp[1]    r = inp[2]    if _type == 1:        print(sum_v[r]-sum_v[l-1])    else:        print(sum_u[r]-sum_u[l-1])
