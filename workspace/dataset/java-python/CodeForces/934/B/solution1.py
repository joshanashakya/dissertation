k=int(input())s=""if k>36:    print(-1)else:    while k>0:        if k>=2:            s=s+"8"            k=k-2        else:            s=s+"4"            k=k-1    print(s)
