t = int(input()) for tc in range(t):    n, m = map(int, input().split())    print('W'+ 'B'*(m-1))    for x in range(n-1):        print('B'*m)   
