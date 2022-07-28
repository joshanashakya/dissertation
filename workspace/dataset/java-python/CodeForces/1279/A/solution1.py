t=int(input())for i in range(t):	r,g,b=sorted(map(int,input().split()))	if(b>g+r+1):	    print("NO")	else:	    print("YES")
