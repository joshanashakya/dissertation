try:    t=int(input())    a=[int(i) for i in input().split()]    c=0    j=[]    for i in range(t):        c=(a[i]-1)*(i+1)+1        j.append(c)            print(sum(j))    except:    pass
