for _ in range(int(input())):    n = input()    q = n.count("0")    w = n.count("1")    e = min(q,w)    if(e%2==0):        print("NET")    else:        print("DA")          
