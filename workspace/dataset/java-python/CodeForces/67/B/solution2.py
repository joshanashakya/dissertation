s = input()
l = s.split() n = int(l[0])
k = int(l[1]) s = input()
l = s.split() b = [-1] for i in range(1, n + 1):    b.append(int(l[i - 1])) for i in range(1, n + 1):  
j = 1
while b[j] != 0:        j += 1     b[j] -= 1
print(j, end=' ')     for t in range(1, n + 1):        if
j - k >= t: b[t] -= 1 
