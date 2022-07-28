t = int(input())
c = []
for i in range(t):     ph = []
blo = 'YES'
a = input().split(' ')
m = int(a[0])
n = int(a[1])
b = list(input())
for j in range(n):         sam = []
for k in b[j::n]:             sam.append(k)
if '1' in sam and '0' in sam:            blo = 'NO'
break elif '1' in sam: ph.append('1') elif '0' in sam: ph.append('0') else:            ph.append('?')
x = ph.count('1')
y = ph.count('0')
z = ph.count('?')
if x > y and z < x - y:
    blo = 'NO'    elif x < y and z < y - x:
    blo = 'NO'
c.append(blo)
for i in range(t):    print(c[i]) 
