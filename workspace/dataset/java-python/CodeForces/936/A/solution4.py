k, d, t = list(map(int, input().split()))if k % d == 0:    print(t)    exit()m = (k+d-1) // d * dif 2*t % (m+k) == 0:    print(m*2*t / (m+k))    exit()n = 2*t // (m+k)res = n*mf = 1 - (m +k) * n/(2*t)if f <= k/t:    print(res+f*t)else:    res += k    f -= k / t    print(res + f*2*t)