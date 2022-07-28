n,k= [int (i) for i in input().split()] totalTime = 240-k for i in range(n, -1, -1):    time = i*(i+1)/2*5     if(time <= totalTime):        print(i)        break
