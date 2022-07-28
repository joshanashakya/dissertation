n = int(input())if n == 0:    print(1)else:    p = 1000000007    y = (n - 1) % (p - 1)    z = pow(2,y,p)    x = ( z * (2 * z + 1) ) % p    print(x)
