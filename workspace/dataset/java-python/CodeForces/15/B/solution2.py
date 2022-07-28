for i in range(int(input())):    n, m, x1, y1, x2, y2 = map(int, input().split())    w,h=abs(x2-x1),abs(y2-y1)    if w*2>n or h*2>m:        print(n*m-2*(n-w)*(m-h))    else:        print(2*w*h)   
