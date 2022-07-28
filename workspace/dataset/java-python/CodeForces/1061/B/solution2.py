n,m=map(int,input().split())a=[int(x) for x in input().split()]a.sort()j=1for i in  a:    if i>=j:        j+=1    #print(j) print(max(sum(a)-n-max(max(a)-j+1,0),0))
