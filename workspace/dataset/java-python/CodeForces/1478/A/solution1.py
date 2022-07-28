t = int(input())
while t:    n = int(input())
a = list(map(int, input().split()))
count = 1
b = []
flag = 0
for i in range(len(a) - 1):        if
a[i] == a[i + 1]: count += 1 else:            flag = 1
b.append(count)
count = 1
b.append(count)
if b != []:
    print(max(b))    else:
    print(len(a))
t -= 1  
