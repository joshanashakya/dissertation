t = int(input()) for i in range(t):    n, m, k = [int(i) for i in input().split()]    h = [int(i) for i in input().split()]    flag = 1     for i in range(n - 1):        m += h[i] - max(0, h[i+1] - k)        if m < 0:            flag = 0            break        if flag:        print("YES")    else:        print("NO")
