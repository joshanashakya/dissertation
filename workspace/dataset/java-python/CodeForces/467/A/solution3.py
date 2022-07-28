n = int(input())e = 0for i in range(n):    l = list(map(int, input().split()))    if(l[0]<l[1]):        a = l[1]-l[0]        if(a>=2):            e = e + 1print(e)
