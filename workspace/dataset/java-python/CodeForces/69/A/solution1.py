pos = [0, 0, 0]
for i in range(int(input())):    forces = input().split()
for j in range(3):        pos[j] += int(forces[j])
if all(i == 0 for i in pos):
    print("YES")else:
    print("NO")
