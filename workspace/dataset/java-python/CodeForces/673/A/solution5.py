intersting=int(input()) l=list(map(int,input().split())) if l[0]>15:    print(15)else:            for i in range(len(l)-1):        if (l[i+1]-l[i]) >15:            print(l[i]+15)            break            else:           if 90-l[-1]<=15:             print(90)        else:            print(l[-1]+15)        
