n = int(input())
ans = ''
mx = -10 ** 100
for i in range(n):    k = input().split()
score = int(k[1]) * 100 - int(k[2]) * 50 + int(k[3]) + int(k[4]) + int(k[5]) + int(k[6]) + int(k[7])
if score > mx:        mx = score
ans = k[0]
print(ans)
