s=input()v="AEIOUYaeiouy"l=[]for i in s[::-1]:    if i !=" " and i!="?":        if i in v:            print("YES")            exit()        else:            print("NO")            exit()    
