a = int(input())
for i in range(a):    s = input()
t = input()
n1 = len(t)
n2 = len(s)
x = n1
while x >= n1:        if
x % n2 == 0 and x % n1 == 0: alpha = x
break
x += 1  # print(alpha)    f1 = alpha // n1    f2 = alpha // n2    #print(f1, f2)    if t * f1 == s * f2:        print(t*f1)    else:        print(-1)    
