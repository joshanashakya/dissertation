test=int(input())total=0for i in range(test):    s=input()    if s.count("+")==2:        total+=1    elif s.count("-")==2:        total-=1print(total)
