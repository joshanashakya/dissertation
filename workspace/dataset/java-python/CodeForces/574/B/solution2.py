import sysn,m = map(int,input().split()) cnts = {i:[] for i in range(1,n+1)} for i in range(m) :        a,b = map(int,input().split())        cnts[a].append(b)    cnts[b].append(a)final = sys.maxsize   for i in range(1,n+1) :        for j in range(i+1,n+1) :                if i in cnts[j] :                                for k in range(j+1,n+1) :                                    if i in cnts[k] and j in cnts[k] :                                    final = min(final,len(cnts[i])+len(cnts[j])+len(cnts[k]))if final==sys.maxsize :        print(-1)else :        print(final-6)                                                                                                                                                                                    