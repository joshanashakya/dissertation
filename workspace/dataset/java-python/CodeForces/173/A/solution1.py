import mathdef lcm(x, y):    if x > y:        z = x    else:        z = y    while(True):        if((z % x == 0) and (z % y == 0)):            lcm = z            break        z += 1    return lcmNikif = 0Policarf = 0games = int(input())Nikiffs_sequence = str(input())Policarf_sequence = str(input())def solution(Nikif,Policarf,games,Nikiffs_sequence,Policarf_sequence):    Policarf_sequence = list(Policarf_sequence)    Nikiffs_sequence =  list(Nikiffs_sequence)#     Policarf_sequence.remove("\n")#     Nikiffs_sequence.remove("\n")    LCM = lcm(len(Nikiffs_sequence),len(Policarf_sequence))    #print(LCM)    #     while len(Nikiffs_sequence) < LCM:#         Nikiffs_sequence+=Nikiffs_sequence#     while len(Policarf_sequence) < LCM:#         Policarf_sequence+=Policarf_sequence    Nikiffs_sequence = Nikiffs_sequence*(LCM//len(Nikiffs_sequence))    Policarf_sequence = Policarf_sequence*(LCM//len(Policarf_sequence))    new_list = list(zip(Nikiffs_sequence,Policarf_sequence))    Nikif_count = 0    Policarf_count = 0     for i in range(len(new_list)):        if new_list[i][0] == new_list[i][1]:            pass        elif new_list[i][0] == "R" and new_list[i][1] == "S":            Nikif_count+=1        elif new_list[i][0] == "S" and new_list[i][1] == "P":            Nikif_count+=1        elif new_list[i][0] == "P" and new_list[i][1] == "R":            Nikif_count+=1        else:            Policarf_count+=1    if games<LCM or games == LCM:        for i in range(games):            if new_list[i][0] == new_list[i][1]:                pass            elif new_list[i][0] == "R" and new_list[i][1] == "S":                Nikif+=1            elif new_list[i][0] == "S" and new_list[i][1] == "P":                Nikif+=1            elif new_list[i][0] == "P" and new_list[i][1] == "R":                Nikif+=1            else:                Policarf+=1    elif games>LCM:        if games % LCM == 0:            Policarf = Policarf_count*(games//LCM)            Nikif = Nikif_count*(games//LCM)            return print(Policarf,Nikif)         else:            Policarf = Policarf_count*(games//LCM)            Nikif = Nikif_count*(games//LCM)            for i in range(games%LCM):                if new_list[i][0] == new_list[i][1]:                    pass                elif new_list[i][0] == "R" and new_list[i][1] == "S":                    Nikif+=1                elif new_list[i][0] == "S" and new_list[i][1] == "P":                    Nikif+=1                elif new_list[i][0] == "P" and new_list[i][1] == "R":                    Nikif+=1                else:                    Policarf+=1             return print(Policarf,Nikif)              return print(Policarf,Nikif)#,"_________________________________________",len(Nikiffs_sequence),len(Policarf_sequence), Nikiffs_sequence,Policarf_sequence)    solution(Nikif,Policarf,games,Nikiffs_sequence,Policarf_sequence)        
