for _ in range(int(input())):    n=int(input())    o,z=0,0    for i in range(n):        b=input().rstrip()        o+=(len(b)%2)        z+=b.count("1")    print(n-(not o and z%2))
