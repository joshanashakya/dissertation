n,k=map(int,input().split())a=list(map(int,input().split()))s2=2*ns4=ns1=0fail=0for i in range(k):  while a[i]>=4:    if s4>0:      s4-=1      a[i]-=4    elif s2>0:      s2-=1      a[i]-=2    elif s1>0:      s1-=1      a[i]-=1    else:      fail=1      breakfor i in range(k):  while a[i]>=2:    if s4>0:      s4-=1      a[i]-=2      s1+=1    elif s2>0:      s2-=1      a[i]-=2    elif s1>0:      s1-=1      a[i]-=1    else:      fail=1      breakfor i in range(k):  while a[i]>=1:    if s4>0:      s4-=1      a[i]-=1      s1+=1    elif s2>0:      s2-=1      a[i]-=1    elif s1>0:      s1-=1      a[i]-=1    else:      fail=1      breakif fail:  print('NO')else:  print('YES')