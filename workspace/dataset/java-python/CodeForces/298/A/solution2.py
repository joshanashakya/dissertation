n = int(input())myStr = input()tempListL = 0tempListR = 0if myStr.find("R") == -1 :    forRevarse = range(len(myStr) , 0 , -1)    for i in forRevarse :        if myStr[i - 1] == "L" :            tempListL = i            break        else:            continue    print(tempListL , myStr.index("L") )elif myStr.find("L") == -1 :    forRevarse = range(len(myStr), 0, -1)    for i in forRevarse:        if myStr[i - 1] == "R":            tempListR = i            break        else :             continue    print(myStr.find("R") + 1 , tempListR + 1)else :    print(myStr.index("R") + 1 , myStr.index("L"))
