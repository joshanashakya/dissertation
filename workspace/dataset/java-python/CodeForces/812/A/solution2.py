p=list(map(int,input().split()))q=list(map(int,input().split()))r=list(map(int,input().split()))s=list(map(int,input().split()))flag=0if p[3]==1:    if p.count(1)>1 or r[1]==1 or q[0]==1 or s[2]==1:        flag=1if q[3]==1:    if q.count(1)>1 or s[1]==1 or r[0]==1 or p[2]==1:        flag=1if r[3]==1:    if r.count(1)>1 or p[1]==1 or s[0]==1 or q[2]==1:        flag=1if s[3]==1:    if s.count(1)>1 or q[1]==1 or p[0]==1 or r[2]==1:        flag=1if flag==0:    print("NO")else:    print("YES")      