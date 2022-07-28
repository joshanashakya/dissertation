import math 

def sieve(n):    nums = [-1, -1] + list(range(2,
                                              n + 1))  # if n = 4 then nums = [-1,-1,2,3,4]    for d in range(2, round(math.sqrt(n))+1):        if nums[d] != -1:            for idx,num in enumerate(nums):                if num not in [-1, d] and num % d == 0:                    nums[idx] = -1                        return [x for x in nums if x != -1] n,m = map(int, input().split())primes = sieve(50)if primes.index(n)+1 < len(primes) and m == primes[primes.index(n)+1]:    print("YES")else:    print("NO")
