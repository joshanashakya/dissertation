def Func(N,D):    i = 1    Lst = []    Val = N    while N*i <= D:        Lst.append(N*i)        i = i + 1     return Lst    K = int(input())L = int(input())M = int(input())N = int(input())D = int(input()) (Lst1,Lst2,Lst3,Lst4)= (Func(K,D),Func(L,D),Func(M,D),Func(N,D)) Set = set(Lst1+Lst2+Lst3+Lst4)if len(Set) <= D:    print(len(Set))else:    print(D) 