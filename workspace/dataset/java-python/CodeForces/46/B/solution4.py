ns,nm,nl,nxl,nxxl=map(int,input().split())n=int(input())for r in range(n):    t=input()    if t=="S":        if ns!=0:            ns-=1            print("S")        elif nm!=0:            nm-=1             print("M")         elif nl!=0:            nl-=1            print("L")        elif nxl!=0:            nxl-=1            print("XL")        elif nxxl!=0:            nxxl-=1            print("XXL")       if t=="M":        if nm!=0:            nm-=1             print("M")         elif nl!=0:            nl-=1            print("L")        elif ns!=0:            ns-=1            print("S")              elif nxl!=0:            nxl-=1            print("XL")        elif nxxl!=0:            nxxl-=1            print("XXL")            if t=="L":        if nl!=0:            nl-=1            print("L")        elif nxl!=0:            nxl-=1            print("XL")        elif nm!=0:            nm-=1             print("M")            elif nxxl!=0:            nxxl-=1            print("XXL")                     elif ns!=0:            ns-=1            print("S")      if t=="XL":         if nxl!=0:            nxl-=1            print("XL")        elif nxxl!=0:            nxxl-=1            print("XXL")        elif nl!=0:            nl-=1            print("L")            elif nm!=0:            nm-=1             print("M")             elif ns!=0:            ns-=1            print("S")      if t=="XXL":        if nxxl!=0:            nxxl-=1            print("XXL")        elif nxl!=0:            nxl-=1            print("XL")            elif nl!=0:            nl-=1            print("L")            elif nm!=0:            nm-=1             print("M")             elif ns!=0:            ns-=1            print("S") 
