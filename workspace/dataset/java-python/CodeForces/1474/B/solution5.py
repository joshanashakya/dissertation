import mathdef

isprime(n): b = 1
i = 2
while (i * i <= math.floor(n)):        if
    (n % i == 0): b = 0
break; else:            i += 1
return b t = int(input())
for i in range(0, t):    d = int(input())
j = 1 + d
p1 = 1
p2 = 1
while True:        if
    (isprime(j) == 1): p1 = j
break else:            j += 1
k = p1 + d
while True:        if
    (isprime(k) == 1): p2 = k
break else:            k += 1
print(p1 * p2)
print()  
