x,y=map(int, input().split());ans=0for i in range(2,x+1,2):    for j in range(2,y+1,2):        ans+=(x-i+1)*(y-j+1)print(ans)  
