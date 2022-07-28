for _ in range(int(input())):    S=input()    if S.count("1")==0:        print(0)    else:        A=S[S.index("1"):S.rfind("1")+1]        print(A.count("0"))
