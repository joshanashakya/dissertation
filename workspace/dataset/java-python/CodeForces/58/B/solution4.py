n = int(input())
x = []
i = nwhile
i > 0:
if n % i == 0:        x.append(i)
n = i
i = i - 1
for i in x:    print(i, end=" ")
