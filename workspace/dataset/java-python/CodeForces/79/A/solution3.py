datos = input().split()
monedas_cien = int(datos[0])
monedas_diez = int(datos[1]) rondas_jugadas = min(monedas_cien // 2, monedas_diez // 24)
monedas_cien = monedas_cien - (rondas_jugadas * 2)
monedas_diez = monedas_diez - (rondas_jugadas * 24) maneras_sacar_cien = [2, 1, 0]
maneras_sacar_diez = [2, 12, 22] ganando = 'Hanako'
continua = Truei = 0
while continua:    if
i % 2 == 0: j = 0
while j < 3:            if
maneras_sacar_cien[j] <= monedas_cien and maneras_sacar_diez[j] <= monedas_diez: monedas_cien = monedas_cien -
                                                                                                maneras_sacar_cien[j]
monedas_diez = monedas_diez - maneras_sacar_diez[j]
ganando = 'Ciel'
break
j = j + 1
if j == 3:            continua = False
break else:        j = 0
while j < 3:            if
maneras_sacar_cien[2 - j] <= monedas_cien and maneras_sacar_diez[2 - j] <= monedas_diez: monedas_cien = monedas_cien -
                                                                                                        maneras_sacar_cien[
                                                                                                            2 - j]
monedas_diez = monedas_diez - maneras_sacar_diez[2 - j]
ganando = 'Hanako'
break
j = j + 1
if j == 3:            continua = False
break
i = i + 1
print(ganando)
