a,b=map(int,input().split())aa=[]bb=[]ans=[]lis=[]liss=[]for t in range(1,a+1):    aa.append(t)for t in range(1,b+1):    bb.append(t)for m in range(len(aa)):    mm=aa[m]    for n in range(len(bb)):        nn=bb[n]        if mm+nn not in  ans:            ans.append(mm+nn)            lis.append(mm)            liss.append(nn)print(len(ans))for t in range(len(lis)):    v=lis[t]    vv=liss[t]    print(v,vv)