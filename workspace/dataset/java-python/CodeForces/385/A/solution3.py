try:    n,c=map(int,input().split())    k=[int(i) for i in input().split()]    a=[]    for i in range(n-1):        if(k[i]<=k[i+1]):            a.append(0)        else:            a.append(k[i]-k[i+1])                          if(max(a)==0 or max(a)<c):        print(0)       else:        print(max(a)-c)except:        pass
