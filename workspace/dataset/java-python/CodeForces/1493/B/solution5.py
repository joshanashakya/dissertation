p = {'5': '2', '2': '5', '1': '1', '0': '0', '8': '8'}
for _ in range(int(input())):    h, m = [int(i) for i in input().split()]
a, b = input().split(":")
for _ in range(50000):        if
any(e not in p for e in a + b):
if int(b) == m - 1:                if
int(a) != h - 1: a = '0' * (a[0] == '0') * (a[1] < '9') + str(int(a) + 1)
b = '00'
continue else:                    a = '00'
b = '00'
continue else:                b = '0' * (b[0] == '0') * (b[1] < '9') + str(int(b) + 1)
continue else:            if int(p[b[1]] + p[b[0]]) < h and int(p[a[1]] + p[a[0]]) < m:                print(
    a + ":" + b)
break else:                if int(b) == m - 1:                    if
int(a) != h - 1: a = '0' * (a[0] == '0') * (a[1] < '9') + str(int(a) + 1)
b = '00'
continue else:                        a = '00'
b = '00'
continue else:                    b = '0' * (b[0] == '0') * (b[1] < '9') + str(int(b) + 1)
continue
