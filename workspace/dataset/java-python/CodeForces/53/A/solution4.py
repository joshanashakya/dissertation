s = str(input())
n = int(input()) asd = [] for i in range(n):     d = str(input())
asd.append(d)
flag = 0
bal = [] for i in asd:    if
s not in i[0:len(s)]: flag += 1 else:        bal.append(i)
if flag == n:    print(s)  else:    bal.sort()
print(bal[0])
