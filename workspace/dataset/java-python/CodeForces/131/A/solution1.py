s=input()x, up, low, st=len(s),0 ,0, ""for i in range (1,x):  if(ord(s[i])>90):    low+=1  else:    up+=1if(up==(len(s)-1) or len(s)==1):  st+=s.swapcase()  print(st)else:  print(s)
