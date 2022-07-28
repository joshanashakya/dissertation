import mathn,k = map(int,input().split())li = list(map(int,input().strip().split()))[:n] total=0for i in li:    temp=math.ceil(i/k)    total+=tempans = math.ceil(total/2)print(ans) 
