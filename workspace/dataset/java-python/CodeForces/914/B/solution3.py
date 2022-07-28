input()q,t={},0a=list(map(int,input().split()))for i in a:q[i]=q.get(i,0)+1for i in q:    if q[i]&1:t=1;breakprint("Conan"if t else"Agasa")
