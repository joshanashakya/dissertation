t=int(input())while t>0:    t-=1    s=input()    if len(s)>=5:        if s[:5]=="miao." and s[::-1][:5]!=".alal":            print("Rainbow's")        elif s[:5]!="miao." and s[::-1][:5]==".alal":            print("Freda's")        else:            print("OMG>.< I don't know!")    else:        print("OMG>.< I don't know!")
