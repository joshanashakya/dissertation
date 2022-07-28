T = int(input())
for i in range(0, T):    a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)
Sum = a + b + c
if Sum % 9 == 0 and Sum / 9 <= min(a, min(b, c)):
    print("YES")    else:
    print("NO")
