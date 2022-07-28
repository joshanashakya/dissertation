import matha=input()
a = a.split()
a = [int(i) for i in a]
b = input()
b = b.split()
b = [int(i) for i in b]
if (a[0] <= b[1] + 1) and (math.floor((b[1] + 1) / 2) - 1 <= a[0]):
    print('YES')elif (a[1] <= b[0] + 1) and (math.floor((b[0] + 1) / 2) - 1 <= a[1]):
    print('YES')else:
    print('NO') 
