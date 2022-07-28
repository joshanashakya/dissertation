for i in range(int(input())):    n=int(input())    print(n*(n+1)//2-(2*sum(2**i for i in range(len(bin(n)[2:])))))
