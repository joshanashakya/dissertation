try:    n=int(input())    k=[int(i) for i in input().split()]    k.sort()    while(min(k)!=max(k)):        k[n-1]=k[n-1]-k[0]        k.sort()    print(min(k)*n)    except:        pass
