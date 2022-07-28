import sysimport mathinput = sys.stdin.readline n = int(input())a = n // 2b = n - awhile math.gcd(a, b) > 1:    a -= 1    b += 1print(a, b)
