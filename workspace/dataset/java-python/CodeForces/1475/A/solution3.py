t = input()
t = int(t)
while t > 0:    n = input()
n = int(n)
if (n & (n - 1) == 0):
    print("NO")    else:
    print("YES")
t -= 1 
