from collections import dequen,m=map(int,input().split()) a=list(map(int,input().split()))d=deque(a)index=deque([int(i) for i in range(1,len(a)+1)])# print(index) i=0while len(index)>1 and i<len(d):    if d[i]<=m:        d.remove(d[i])        index.remove(index[i])        i-=1    else:        a=d.popleft()        b=index.popleft()        i-=1        d.append(a-m)        index.append(b)    # print(d,index)    i+=1  print(index[0])