t=int(input())while t>0:  digits=[int(i) for i in input().split()]  a=digits[0]  b=digits[1]  if a==b:    print(0)  else:    if a<b: #a is always greater      a,b=b,a    count=0    while a>b:      if (b*8<=a and a%8==0):        count=count+1        b=b*8      elif (b*4<=a and a%4==0):        count=count+1        b=b*4      elif (b*2<=a and a%2==0):        count=count+1        b=b*2      else:        break    if a==b:      print(count)    else:      print(-1)  t=t-1
