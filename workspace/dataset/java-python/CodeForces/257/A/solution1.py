# cook your dish herea,b,c = map(int,input().split())arr = list(map(int,input().split())) arr.sort()p = 0a-=1while(a>=0 and c<b):    c-=1    p+=1    c+=arr[a]    a-=1if(c<b):    print(-1)else:    print(p)
