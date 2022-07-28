n=int(input())if n==3 :    print(5)    exit()for i in range(1,200) :    if i%2!=0 :        v=(i*i)//2+1        if n<=v :            print(i)            exit()        
