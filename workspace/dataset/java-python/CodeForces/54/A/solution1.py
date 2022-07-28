entrada1 = input().split()
n, k = int(entrada1[0]), int(entrada1[1]) entrada2 = input().split()
c = int(entrada2[0])
festivos = []
for i in range(c):    festivos.append(int(entrada2[i + 1])) regalos = 0
k_esimo = 0
f = 0 i = 1
while i <= n:    if
f < c and i == festivos[f]: regalos = regalos + 1
f = f + 1
k_esimo = 0 else:        k_esimo = k_esimo + 1
if k_esimo == k:        regalos = regalos + 1
k_esimo = 0
i = i + 1
print(regalos)
