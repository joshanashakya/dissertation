import mathtestcases=int(input())
for i in range(0, testcases):    xyk = input()
m = xyk.split()
x = int(m[0])
y = int(m[1])
k = int(m[2])
s = 0
r = (k * y + k - 1) % (x - 1)
if (r == 0):
    s = (k * y + k - 1) // (x - 1)    else:
    s = 1 + (k * y + k - 1) // (x - 1)
t = k + s
print(t)
