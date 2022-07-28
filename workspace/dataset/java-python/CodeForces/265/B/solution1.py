n = int(input())count = 0g = int(input())count+=g+1for i in range(n-1):    a = int(input())    if(a>g):        count+=a-g+1+1        g = a    else:        count+=g-a+1+1        g = aprint(count)
