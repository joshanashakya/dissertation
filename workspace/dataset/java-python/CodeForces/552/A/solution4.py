r=0for i in range(int(input())):    x1,y1,x2,y2 = list(map(int,input().split()))    r = r + (x2-x1+1)*(y2-y1+1)print(r)
