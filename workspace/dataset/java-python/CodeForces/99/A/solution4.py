numero = input()

indice_punto = -1
i = 0

while indice_punto == -1 and i < len(numero):
    if numero[i] == '.':
        indice_punto = i
    i = i + 1

unidades = int(numero[indice_punto - 1])
decimas = int(numero[indice_punto + 1])

if unidades < 9 and decimas < 5:
    print(numero[:indice_punto])
elif unidades < 9 and decimas >= 5:
    print(numero[:indice_punto - 1] + str(int(numero[indice_punto - 1]) + 1))
else:
    print('GOTO Vasilisa.')
