n,m=map(int,input().split())alist=[]for i in range(n):    word=str(input())    blist=[]    for i in range(len(word)):        blist.append(word[i])        alist.append(blist) count=0if m==1 or n==1:    print("0")else:        for i in range(1,n):        for j in range(1,m):            clist=[]            clist.append(alist[i-1][j-1])            clist.append(alist[i][j])            clist.append(alist[i][j-1])            clist.append(alist[i-1][j])                               if "f" in clist and "a" in clist and "c" in clist and "e" in clist:                count=count+1            else:                continue    print(count)
