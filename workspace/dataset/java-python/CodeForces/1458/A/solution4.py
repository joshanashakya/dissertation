n, m = tuple(map(int, input().split()))
a = list(map(int, input().split()))
b = list(map(int, input().split())) 

def gcd(a, b):    while


b: a, b = b, a % b
return a temp = 0
for i in range(1, len(a)):    temp = gcd(temp, abs(a[i] - a[i - 1])) for i in range(len(b)):    print(
    gcd(b[i] + a[0], temp), end=' ')
