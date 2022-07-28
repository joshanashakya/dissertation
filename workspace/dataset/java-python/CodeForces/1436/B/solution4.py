for i in range(int(input())):    num = int(input())
a = [0 for j in range(num - 2)]
a.append(1)
a.append(4)
for k in range(num):        print(*a)
a.append(a[0])
a.pop(0)
