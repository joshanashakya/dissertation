dict={"A":0,"B":0,"C":0}for i in range(3):    s=input()    if(s[1]==">"):        dict[s[0]]+=1    else:        dict[s[2]]+=1if dict["A"]== dict["B"] or  dict["B"]== dict["C"] or  dict["C"]== dict["A"]:     print('Impossible')else:    if dict["A"]==0:        print("A",end="")    elif dict["B"]==0:        print("B",end="")    elif dict["C"]==0:        print("C",end="")    if dict["A"]==1:        print("A",end="")    elif dict["B"]==1:        print("B",end="")    elif dict["C"]==1:        print("C",end="")    if dict["A"]==2:        print("A",end="")    elif dict["B"]==2:        print("B",end="")    elif dict["C"]==2:        print("C",end=" ")    
