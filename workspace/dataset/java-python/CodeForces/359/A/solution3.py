m,n=map(int,input().split())lst=[]count=0cond=Falsefor x in range(m):     arr=list(map(int,input().split()))    lst.append(arr)if 1 in lst[count] or 1 in lst[m-1] :    cond=Truemst=[ x[0] for x in lst ]cst=[ x[-1] for x in lst]if 1 in mst or cond==True or 1 in cst:    print(2)else:    print(4)