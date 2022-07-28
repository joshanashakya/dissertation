t = int(input())
for i in range(t):    x = int(input())
c = 0
sum = 0
while sum < x:        c += 1
sum = sum + c
re = sum - x  # print(re)    if re==0:        print(c)    elif re==1:        print(c+1)    else:        print(c)             
