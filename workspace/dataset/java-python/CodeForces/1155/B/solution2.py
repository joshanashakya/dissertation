n=int(input())s=input();flag=True;cnt=0for i in range(0,n-10,2): # print(i,s[i])  if s[i]=='8':cnt+=1for i in range(1,n-10,2):  #print(s[i])  if s[i]=='8':cnt+=1if cnt<(n-11)//2+1:print("NO")else:print("YES") 
