n,m=map(int,input().split())if m==0:    print("YES")    exit()else:    D = list(map(int, input().split()))    D.sort()    if m==1:        if D[0]!=1 and D[0]!=n:            print("YES")        else:            print("NO")    else:        if D[0] == 1 or D[-1] == n:            print("NO")            exit()         for i in range(m-2):             if D[i]-D[i+1]==-1 and D[i+1]-D[i+2]==-1:                print("NO")                exit()        print("YES")      
