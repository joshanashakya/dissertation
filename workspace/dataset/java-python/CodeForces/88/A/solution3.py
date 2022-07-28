a = {"C": 1, "C#": 2, "D": 3, "D#": 4, "E": 5, "F": 6, "F#": 7, "G": 8, "G#": 9, "A": 10, "B": 11, "H": 12}
x, y, z = input().split()
b = sorted([a[x], a[y], a[z]])
c = [b[1] - b[0], b[2] - b[1]]
if c[0] == 4 and c[1] == 3 or c[0] == 3 and c[1] == 5 or c[0] == 5 and c[1] == 4:
    print("major")elif c[0] == 3 and c[1] == 4 or c[0] == 5 and c[1] == 3 or c[0] == 4 and c[1] == 5:
    print("minor")else:
    print("strange")
