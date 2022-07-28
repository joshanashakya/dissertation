l=[]for i in range(2):    r,o=input(),input()    r=list(o[0]+r+o[1])    r.remove("X");    while r[0]!="A":r[0],r[1],r[2]=r[2],r[0],r[1]    l.append("".join(r))print("YES"if l[0]==l[1]else"NO")
