a = []for i in range(8):    b = input()    a.append(b)white = 0black = 0for i in range(8):    for x in range(8):        if a[i][x] == "r":            black = black + 5        elif a[i][x] == "b":            black = black + 3        elif a[i][x] == "n":            black = black + 3        elif a[i][x] == "p":            black = black + 1        elif a[i][x] == "q":            black = black + 9        elif a[i][x] == "R":            white = white + 5        elif a[i][x] == "B":            white = white + 3        elif a[i][x] == "N":            white = white + 3        elif a[i][x] == "P":            white = white + 1        elif a[i][x] == "Q":            white = white + 9if white > black:    print("White")elif black > white:    print("Black")else:    print("Draw")            