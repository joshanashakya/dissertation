for _ in range(int(input())):    n=int(input())    l=list(map(int,input().split()))    l=sorted(l,reverse=True)    x=abs(l[(2*n)//2]-l[((2*n)//2)-1])    print(x)    
