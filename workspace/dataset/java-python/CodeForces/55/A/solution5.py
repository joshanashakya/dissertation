n = int(input())
flag = 1
while n > 1:    if
n % 2: flag = 0
break
n = n // 2
if flag:
    print("YES")else:
    print("NO")
