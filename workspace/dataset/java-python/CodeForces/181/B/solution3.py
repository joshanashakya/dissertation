from sys import stdina=int(stdin.readline())k=[[int(i)+1000 for i in map(int,input().split())] for _ in " "*a]ok=[[0]*(2001) for _ in " "*2001]for i in k:ok[i[0]][i[1]]=1ans=0for i in range(a):    for j in range(i+1,a):        if (k[i][0]+k[j][0])%2==0 and (k[i][1]+k[j][1])%2==0 and ok[(k[i][0]+k[j][0])//2][(k[i][1]+k[j][1])//2]:ans+=1print(ans)
