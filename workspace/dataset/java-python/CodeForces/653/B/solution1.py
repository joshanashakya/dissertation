l=[]n,q=map(int,input().split())al=["a","b","c","d","e","f"]qu=[]qu.append(("",0))while qu:  s,cnt=qu.pop(0)  if cnt==n:    l.append(s)    continue  for i in range(6):    ss=s+al[i]    qu.append((ss,cnt+1))l=list(set(l))cnt=0item=[input().split(" ") for i in range(q)]def df(s):  global cnt  if s=="a":    cnt+=1    return  elif len(s)==1:    return  for t1,t2 in item:    if s[0:2]==t1:      t=t2+s[2:]      df(t)for s in l:  df(s)print(cnt)
