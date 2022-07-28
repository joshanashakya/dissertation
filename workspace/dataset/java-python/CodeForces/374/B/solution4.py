s,a,c=input(),1,1for i in range(1,len(s)):  if int(s[i])+int(s[i-1])==9:      c+=1  elif c%2:a*=c//2+1;c=1  else:c=1if(c%2):a*=c//2+1print(a)
