for i in range(int(input())):    L = list(map(int, input().split()))
L.sort()
a = L[0]
b = L[1]
c = L[2]
print(int(((c - a) ** 2 + b ** 2) ** 0.5 + 0.5))
