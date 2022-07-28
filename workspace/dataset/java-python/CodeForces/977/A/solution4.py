a,b = map(int,input().split())count =1while count<=b:    if a%10 != 0:        a -=1        count += 1    if a %10 == 0 and count<=b:        a =a//10        count+=1print(a)      
