for _ in range(int(input())):    d = int(input())


def prime(a):        for


i in range(2, int(a ** 0.5) + 1):
if a % i == 0:                return False
return True
k = 1
b = k + d
while not prime(b):        b += 1
k *= b
p = k + d
while not prime(p):        p += 1
print(k * p)
