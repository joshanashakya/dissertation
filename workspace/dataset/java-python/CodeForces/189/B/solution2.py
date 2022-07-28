a,b=map(int,input().split());s=0for i in range(2,a+1,2):    for j in range(2,b+1,2):s+=(a-i+1)*(b-j+1)print(s)
