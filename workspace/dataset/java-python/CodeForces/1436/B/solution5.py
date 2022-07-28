def isPrime(n):  


if n <= 1:        return False
if n <= 3:        return True     if n % 2 == 0 or n % 3 == 0:        return False     i = 5
while i * i <= n:        if
n % i == 0 or n % (i + 2) == 0:
return False
i = i + 6
return True  t = int(input())
for _ in range(t):    n = int(input())
lst = []  # i = 0    # while len(lst) != n:    #     if isPrime(i) is False:    #         lst.append(i)    #     i += 1    for i in range(n):        if i == 0:            lst.append(1)        elif i == 1:            lst.append(1)        else:            lst.append(0)     for j in range(len(lst)):        saved = j        for z in range(j, len(lst)):            print(lst[z], end= " ")        for d in range(0, j):            print(lst[d], end=" ")        print()
