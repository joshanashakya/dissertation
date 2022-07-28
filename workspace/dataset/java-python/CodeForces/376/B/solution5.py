from sys import stdina,b=map(int,stdin.readline().split());z=[0]*afor _ in " "*b:u,v,w=map(int,stdin.readline().split());z[u-1]+=w;z[v-1]-=wprint(sum(max(0,z[i]) for i in range(a)))
