n = int(input())if n&1:           #n is odd    ans = [0]*2*n    pm = 0    for i in range(n):        ans[i] = 2*i+1+pm        ans[i+n] = 2*i+2-pm        pm = 1-pm    print("YES")    print(*ans)else:    print("NO")  #mujhse nhi hua tha ye