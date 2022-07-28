def isPrime(n):    if


(n <= 1):
return False
if (n <= 3):        return True
if (n % 2 == 0 or n % 3 == 0):        return False
i = 5
while (i * i <= n):        if
(n % i == 0 or n % (i + 2) == 0):
return False
i = i + 6
return Truet=int(input())
for a in range(t):    d = int(input())
b1 = 1
b2 = b1 + d
while (isPrime(b2) == False):        b2 += 1
b3 = b2 + d
while (isPrime(b3) == False):        b3 += 1
print(b2 * b3)
