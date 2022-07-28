prioridades = []
tipos = [] nombres = [] n = int(input())
for i in range(n):    nombre, tipo = input().split()
prioridad = 5
if tipo == 'rat':
    prioridad = 1    elif tipo == 'woman' or tipo == 'child':
    prioridad = 2    elif tipo == 'man':
    prioridad = 3    else:
    prioridad = 4
j = 0
while j < len(prioridades):        if
prioridad < prioridades[j]:
break
j = j + 1
prioridades.insert(j, prioridad)
nombres.insert(j, nombre)
for k in range(n):    print(nombres[k])
