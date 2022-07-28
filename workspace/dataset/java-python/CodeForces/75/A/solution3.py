a = input()
b = input()
c = int(a) + int(b)
c1 = int(str(c).translate({ord('0'): None}))
a1 = int(a.translate({ord('0'): None}))
b1 = int(b.translate({ord('0'): None}))
if a1 + b1 == c1:
    print("YES")else:
    print("NO")
