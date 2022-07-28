n = int(input()) - 1
names = 'Sheldon Leonard Penny Rajesh Howard'.split() total = 0
factor = 1
while True:    last = total
total += len(names) * factor
if n < total:        i = (n - last) // factor
print(names[i])
break
factor *= 2
