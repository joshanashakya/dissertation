n=int(input())l=list(map(int,input().split()))mx=-10000000for num in l:    if(num<0):        mx=max(mx,num)    beg=0    end=1000    while(beg<=end):        mid=beg+(end-beg)//2        if(mid*mid<=num):             beg=mid+1        else:            end=mid-1    if(end*end<num):        mx=max(mx,num)print(mx)
