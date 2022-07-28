n=int(input())L=[int(x) for x in input().split()]pos=[0]*nfor i in range(n):    pos[L[i]-1]=ians=0for i in range(n-1):    ans+=abs(pos[i]-pos[i+1])print(ans)
