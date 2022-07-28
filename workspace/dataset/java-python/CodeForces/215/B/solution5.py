a=list(map(int,input().split()[1::]))b=list(map(int,input().split()[1::]))c=list(map(int,input().split()[1::]))A,B=map(int,input().split())print(max(a)*((B*max(b))/((A*min(c)+B*max(b))))**0.5)
