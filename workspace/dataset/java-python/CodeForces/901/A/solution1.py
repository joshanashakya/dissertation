n = int(input())n+=1l = list(map(int,input().split()))ans = 0for i in range(n-1):    if(l[i]>1 and l[i+1]>1):        ans = i+1        breakelse:    print("perfect")    exit(0)print("ambiguous")prev = 0now = 0for i in range(n):    for j in range(l[i]):        print(prev,end = " ")        now+=1    prev =nowprint()prev = 0now = 0for i in range(n):    for j in range(l[i]):        if(ans==i):            print(prev-1,end = " ")            ans = -1        else:            print(prev,end = " ")        now+=1    prev =now