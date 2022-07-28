for i in range(int(input())):    n = int(input())
j = 0
while n >= 0:        j += 1
c = 2 ** j - 1
n -= (c * (c + 1)) // 2
print(j - 1)
