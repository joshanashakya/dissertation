n=int(input()) a = list(map(int,input().split())) ma=max(a)mi=min(a) a.remove(ma)a.remove(mi)#print(a)a.sort()#print(a)#print(ma,mi)a.insert(0,ma)#print(a)a.append(mi)#print(a) print(*a)
