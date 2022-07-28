if __name__ == '__main__':    cin = input
x, y, z = cin().split()
a = ["C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "B", "H"]
x, y, z = a.index(x), a.index(y), a.index(z)
b = [(x, (x + 3) % 12, (x + 7) % 12), (y, (y + 3) % 12, (y + 7) % 12), (z, (z + 3) % 12, (z + 7) % 12)]
c = [(x, (x + 4) % 12, (x + 7) % 12), (y, (y + 4) % 12, (y + 7) % 12),
     (z, (z + 4) % 12, (z + 7) % 12)]     for i in range(3):        lb = set([x, y, z]).intersection(set(b[i]))
lc = set([x, y, z]).intersection(set(c[i]))
if len(lc) == 3:            print("major")
break
if len(lb) == 3:            print("minor")
break else:        print("strange")
