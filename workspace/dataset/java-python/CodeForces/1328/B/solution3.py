from sys import stdininput = stdin.buffer.readlineimport math t=int(input())for i in range(t):    n,k=map(int,input().split())     x=math.floor((math.sqrt(1+4*2*k)-1)/2)        sx=(x*(x+1))//2    m=k-sx        if m==0:        s="bb"+"a"*(x-1)        s=(n-len(s))*"a"+s        print(s)        continue     s="a"*(n-(x+2))+"b"    ss="b"+(m-1)*"a"    l=len(s)+len(ss)    print(s+(n-l)*"a"+ss)  