adet = int(input(''))liste = []for _ in range(adet):    p1 = input('')    p2 = input('')    liste.append((p1, p2))for __ in liste:    occ = __[1].split()    mevcut_konum = int(__[0].split()[1])    finder1 = mevcut_konum    finder2 = mevcut_konum    while True:        if str(finder1) not in occ:            print(abs(finder1-mevcut_konum))            break        elif str(finder2) not in occ:            print(abs(finder2-mevcut_konum))            break        if finder1 < int(__[0].split()[0]):            finder1+=1        if finder2 > 1:            finder2-=1