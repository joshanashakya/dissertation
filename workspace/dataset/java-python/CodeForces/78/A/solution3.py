v = set('aeiou')
arr = [5, 7, 5]
for i in range(3):    s = input()
temp = 0
for letter in s:        if
letter in v: temp += 1
if temp != arr[i]:        print('NO')
exit()
print('YES') 
