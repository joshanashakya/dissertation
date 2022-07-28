import sys n, m, k = map(int, input().split()) if n-1 >= k:    print(k+1, 1)else:    div, mod = divmod(k-n, m-1)    if div % 2 == 0:        print(n-div, mod+2)    else:        print(n-div, m-mod)
