import matht = int(input())
while t > 0:    a = input().split()
n = int(a[0])
k = int(a[1])
if k == 1:
    print(1)    else:
    k = math.ceil(n / k) * k
print(math.ceil(k / n))
t -= 1
