a,b=map(int,input().split())k=0for i in range(1,a+1):    if(i%2!=0):        print('#'*b)    else:        if(k==1):            print('#'+('.'*(b-1)))            k=0        elif(k==0):            print('.'*(b-1)+'#')            k=1        