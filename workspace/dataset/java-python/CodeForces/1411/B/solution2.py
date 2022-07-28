def is_just(num):    newnum = num


while newnum > 0:        if
newnum % 10 != 0:
if num % (newnum % 10) != 0:                return False
newnum //= 10
return True         t = int(input())
for ti in range(t):    n = int(input())
x = n
while not is_just(x):        x += 1
print(x)
