b = int(input())def make_divisors(n):    divisors = []    for i in range(1, int(n**0.5)+1):        if n % i == 0:            divisors.append(i)            if i != n // i:                divisors.append(n//i)     #divisors.sort(reverse=True)    return divisors d = make_divisors(b)print(len(d))
