for _ in range(int(input())):    n=int(input())    i=n    p=list()    while i>=10:        l=i-(i%10)        p.append(l)        k=(i//10)+(i%10)        i=k    print(sum(p)+i)    
