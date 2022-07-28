n, y, x, mm, count= int(input()), 0, 0, input(), 0arr= mm.split(" ")while(n!=0):  m= int(arr[count])  if(m%2==0):    x+=1  else:    y+=1  n-=1  count+=1if(y%2==1):print(y)else:print(x)    
