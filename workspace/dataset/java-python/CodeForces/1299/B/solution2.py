import sysinput = sys.stdin.readline n=int(input())A=[tuple(map(int,input().split())) for i in range(n)]if n%2!=0:    print("NO")else:    mid=(A[0][0]+A[n//2][0],A[0][1]+A[n//2][1])    for i in range(n//2):        if mid!=(A[i][0]+A[i+n//2][0],A[i][1]+A[i+n//2][1]):            print("NO")            sys.exit()    print("YES")