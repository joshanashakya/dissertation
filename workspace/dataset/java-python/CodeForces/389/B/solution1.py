def out(matri):    verdade = True     for i in matri:        if '#' in i:            verdade = False     if verdade:        print('YES')        else:        print('NO') def main():    n = int(input())    matri = []    for _ in range(n):        matri.append(list(input()))     for i in range(n):        for j in range(n):            if (matri[i][j] == '.'):                continue             devePintar = 0            estaem = [                #não esta                 j + 1 != n, #a direita                j != 0, #a esquerda                i != 0, #em cima                i + 1 != n #em baixo            ]                        if (estaem[0] and matri[i][j + 1] == '#'):                devePintar += 1                        if (estaem[1] and matri[i][j - 1] == '#'):                devePintar += 1                        if (estaem[2] and matri[i - 1][j] == '#'):                devePintar += 1                        if (estaem[3] and matri[i + 1][j] == '#'):                devePintar += 1             if devePintar == 4:                matri[i][j] = '.'                if (estaem[0] and matri[i][j + 1] == '#'):                    matri[i][j + 1] = '.'                                if (estaem[1] and matri[i][j - 1] == '#'):                    matri[i][j - 1] = '.'                                if (estaem[2] and matri[i - 1][j] == '#'):                    matri[i - 1][j] = '.'                                if (estaem[3] and matri[i + 1][j] == '#'):                    matri[i + 1][j] = '.'                        out(matri)         if __name__ == '__main__':    main()  		      					 	  	 	   		 			