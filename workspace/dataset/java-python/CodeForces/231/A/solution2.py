x = int(input())erg = 0for i in range(x):    l = input()    count = 0    if l[0]=='1': count +=1    if l[2]=='1': count +=1    if l[4]=='1': count +=1    if count >= 2:        erg +=1print(erg)
