import math  vladik, valera = map(int, input().split()) turn = 1vladik_gives = 1valera_gives = 2zero = [] while (vladik > 0) or (valera > 0):    if (vladik < 0) or (valera < 0):        break     if turn % 2 == 0 :        valera -= valera_gives        valera_gives += 2    else:        vladik -= vladik_gives        vladik_gives += 2        if valera == 0:        zero.append("Valera")    if vladik == 0:        zero.append("Vladik")         turn += 1    if vladik == 0 and valera == 0:    print(zero[0])elif vladik <= valera:    print("Vladik")else:    print("Valera")   """def steps(candy):    if candy % 2 == 0:        return (-0.5 + (math.sqrt(1 + (4 *candy)) * 0.5))    return (math.sqrt(candy)) vladik_steps = steps(vladik) valera_steps = steps(valera)  print(vladik_steps, valera_steps)if vladik == valera :    if vladik % 2 != 0:        print("Valera")    else:        print("Vladik")elif int(vladik_steps) < int(valera_steps):    print("Vladik")elif int(vladik_steps) > int(valera_steps):    print("Valera")elif int(vladik_steps) == int(valera_steps):    if vladik - (vladik_steps ** 2) == 0:        if valera - ((valera_steps) * (valera_steps + 1)) >= (valera_steps + 2):            print ("Vladik")     print(vladik - (vladik_steps ** 2) - vladik_steps - 2)    if vladik - (vladik_steps ** 2) - vladik_steps - 2 < 0:        print("Vladik")    else:        print("Valera") """