n=int(input())d={"A":float("inf"),"B":float("inf"),"C":float("inf"),"AB":float("inf"),"AC":float("inf"),"BC":float("inf"),"ABC":float("inf")}for _ in range(n):    cost,vits=input().split()    cost=int(cost)    if(len(vits)==1):        if(d[vits]>cost):            d[vits]=cost    elif(len(vits)==2):        if("A" in vits and "B" in vits):            if(d["AB"]>cost):                d["AB"]=cost        elif("A" in vits and "C" in vits):            if(d["AC"]>cost):                d["AC"]=cost        else:            if(d["BC"]>cost):                d["BC"]=cost    else:        if(d["ABC"]>cost):            d["ABC"]=cost            val=min(d["A"]+d["B"]+d["C"],d["A"]+d["BC"],d["B"]+d["AC"],d["C"]+d["AB"],d["AB"]+d["AC"],d["AB"]+d["BC"],d["AC"]+d["BC"],d["ABC"])if(val==float("inf")):    print(-1)else:    print(val)            