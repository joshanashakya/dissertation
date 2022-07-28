import matht=int(input())
for i in range(t):  
if i != 0:           input()
n, x = list(map(int, input().split()))     a = list(map(int, input().split()))
b = list(map(int, input().split()))     l = []
f = 0     for i in range(int(n)):           l.append(a[i] + b[n - i - 1])     for i in range(len(l)):  
if l[i] > x:            print("No")
f = 1
break
if f == 0:        print("Yes")  # rstrip()
