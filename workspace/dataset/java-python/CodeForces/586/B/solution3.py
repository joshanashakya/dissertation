a=int(input())z=[[0]+list(map(int,input().split())),[0]+list(map(int,input().split()))]r=[0]+list(map(int,input().split()))k=[]for i in range(a,0,-1):k.insert(0,sum(z[0][:i])+r[i]+sum(z[1][i:]))s=min(k);k[k.index(s)]=2*a*100;print(s+min(k))
