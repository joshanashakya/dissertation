n = input()
l = list(n)
s = len(l) 

def main():    i1, i2, i3, i4, i5 = 0, 0, 0, 0, 0


for i in range(s):        if
    (l[i] == 'h'): i1 = i + 1
break
if i1 == 0:         print('NO')
return
for i in range(i1, s):        if
    (l[i] == 'e'): i2 = i + 1
break
if i2 == 0:        print('NO')
return
for i in range(i2, s):        if
    (l[i] == 'l'): i3 = i + 1
break
if i3 == 0:         print('NO')
return
for i in range(i3, s):        if
    (l[i] == 'l'): i4 = i + 1
break
if i4 == 0:         print('NO')
return     for i in range(i4, s):        if
    (l[i] == 'o'): i5 = i + 1
break
if i5 == 0:         print('NO')
return elif (i1 < i2 < i3 < i4 < i5): print('YES')
return else:        print('NO')
return  main() 
