s1 = input()s2 = input()t1 = 0t2 = 0 for i in range(0,len(s1),2):    if s1[i] == '[':        if s2[i] == '(':            t1+=1        if s2[i] == '8':            t2+=1    if s1[i] == '(':        if s2[i] == '[':            t2+=1        if s2[i] == '8':            t1+=1    if s1[i] == '8':        if s2[i] == '(':            t2+=1        if s2[i] == '[':            t1+=1            if(t1 > t2):    print("TEAM 1 WINS")elif(t1 < t2):    print("TEAM 2 WINS")else:    print("TIE")