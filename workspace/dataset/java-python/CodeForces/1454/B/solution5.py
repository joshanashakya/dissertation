t = int(input())
for _ in range(t):    n = int(input())
a = list(map(int, input().split()))
b = sorted(a)     if n == 1:
    print(1)    else:
    mini = -1
if b[0] != b[1]:
    mini = b[0]        else:
     
for i in range(1, n - 1):                if
b[i] != b[i + 1] and b[i] != b[i - 1]: mini = b[i]
break             if mini == -1 and b[n - 1] != b[n - 2]:                mini = b[n - 1]         if mini == -1:
    print(-1)        else:
    print(a.index(mini) + 1)  
