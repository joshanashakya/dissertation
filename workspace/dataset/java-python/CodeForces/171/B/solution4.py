import mathimport sysinput = sys.stdin.readline def inp():    return(int(input()))def inlt():    return(list(map(int,input().split()))) n = inp()print(n*(n-1)*6 + 1)
