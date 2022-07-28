a,b=map(int,input().split())if a<b:    c=b-a    print(a,end=" ")else:    c=a-b    print(b,end=" ")if c==1:    print(0)else:    print(c//2)
