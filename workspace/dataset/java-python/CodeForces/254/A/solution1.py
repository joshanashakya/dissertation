f=open("input.txt", "r")text = f.readlines()f.close() n = int(text[0]) cards = [int(c) for c in text[1].split()] f = open("output.txt", "w") dicti = {} for bruh in sorted(set(cards)):    dicti[bruh] = [] for i, j in enumerate(cards):    dicti[j].append(str(i+1)) for k in dicti:    v = dicti[k]    if len(v) % 2 == 1:        f.write(str(-1))        exit()for k1 in dicti:    v1 = dicti[k1]    f.write(' '.join(v1))    f.write('\n') f.close()  