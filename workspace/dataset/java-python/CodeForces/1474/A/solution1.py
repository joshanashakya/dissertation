for t in range(int(input())):    n = int(input())
b = input()
a = ''
d = ''
for i in b:        try:            if 1 + int(i) == int(d[-1]):
    a += '0'            else:
    a += '1'        except:            a = '1'
d = str(int(a[-1]) + int(i))
print(a)
