import math inp = lambda: map(int, input().split())MAX_ELEM = int(1e6+5) n = int(input())a = list(inp()) def sieve():    prime = [True] * MAX_ELEM    i = 2    while i*i < MAX_ELEM:        if prime[i]:            j = 2            while i*j < MAX_ELEM:                prime[i*j] = False                j += 1        i += 1    prime[0], prime[1] = False, False     return prime  prime = sieve()for i in range(n):    sq = int(math.sqrt(a[i]))    if sq*sq == a[i] and prime[sq]:        print("YES")    else:        print("NO")
