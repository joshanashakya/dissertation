possibilidades = []for i in range(5):    lista = []    for j in range(5):        if j == i:            continue        for k in range(5):            if k == j or k == i:                continue            for l in range(5):                if l == k or l == j or l == i:                    continue                for m in range(5):                    if m == l or m == k or m == j or m == i:                        continue                    lista.append(i)                    lista.append(j)                    lista.append(k)                    lista.append(l)                    lista.append(m)                    possibilidades.append(lista)                    lista = [] matriz = []linha = []max = 0num = 0for i in range(5):    linha = input().split()    matriz.append(linha)for i in range(len(possibilidades)):    num = 0    num += int(matriz[possibilidades[i][0]][possibilidades[i][1]])    num += int(matriz[possibilidades[i][1]][possibilidades[i][0]])    num += int(matriz[possibilidades[i][1]][possibilidades[i][2]])    num += int(matriz[possibilidades[i][2]][possibilidades[i][1]])    num += 2* int(matriz[possibilidades[i][2]][possibilidades[i][3]])    num += 2* int(matriz[possibilidades[i][3]][possibilidades[i][2]])    num += 2* int(matriz[possibilidades[i][3]][possibilidades[i][4]])    num += 2* int(matriz[possibilidades[i][4]][possibilidades[i][3]])    if num > max:        max = numprint(max)		 					 				 		   	 		 	 					
