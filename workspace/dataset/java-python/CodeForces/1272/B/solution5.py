# Har har mahadev# author : @ harsh kanani import mathfrom collections import Counterfor _ in range(int(input())):    s = input()    d = {"U": 0, "R": 0, "D": 0, "L": 0}    for i in s:        d[i] += 1    #print(d)    d["L"] = min(d["L"], d["R"])    d["R"] = min(d["L"], d["R"])    d["U"] = min(d["U"], d["D"])    d["D"] = min(d["U"], d["D"])    ans = 0    str = ""    if d["L"]==0 and d["R"]==0 and d["U"] > 0 and d["D"]>0:        print(2)        print("UD")    elif d["U"]==0 and d["D"]==0 and d["L"] > 0 and d["R"]>0:        print(2)        print("LR")    else:        for i in d:            ans += d[i]            temp = i*d[i]            str += temp        print(ans)        if ans==0:            print()        else:            print(str) 