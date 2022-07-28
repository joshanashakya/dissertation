a=int(input())for _ in range(a):    count=0    h,m=input().split()    h=int(h)    m=int(m)    count+=60-m    h+=1    count+=60*(24-h)    print(count)
