N = int(2e6+3)is_prime = [0] * Ndef sieve():    is_prime[1] = 1;    for i in range(2, N):        if is_prime[i] == 1:             continue        for j in range(2*i, N, i):            is_prime[j] = 1 def palindrom(s):    return  s == s[::-1] p, q = map(int, input().split())rub = 0pi = 0sieve()for i in range(1, N):    if is_prime[i] == 0:         pi += 1    if palindrom(str(i)):         rub += 1    if pi * q <= rub * p:         res = iprint(res)
