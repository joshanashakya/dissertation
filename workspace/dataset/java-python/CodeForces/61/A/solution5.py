a = input()
b = input()
a = [x for x in a]
b = [y for y in b] x = ['0' if i1 == i2 else '1' for (i1, i2) in zip(a, b)]
print(''.join(x))
