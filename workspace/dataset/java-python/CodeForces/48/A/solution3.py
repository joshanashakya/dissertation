manos = [input(),input(),input()] indice_ganador = Nonejugadores = ['F','M','S']#manos = ['rock','paper','scissors']reglas = ['paper','rock','scissors','paper'] for i in range(3):    for j in range(4):        if manos[i] == reglas[j]:            if reglas[j+1] == manos[(i+1)%3] and reglas[j+1] == manos[(i+2)%3]:                indice_ganador = i            break if indice_ganador != None:    print(jugadores[indice_ganador])else:    print('?')
