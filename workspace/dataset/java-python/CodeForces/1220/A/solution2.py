n=int(input())str1=input()z_count=0n_count=0ans=""for i in str1:    if(i=="z"):        z_count=z_count+1    if(i=="n"):        n_count=n_count+1 for i in range(0,n_count):    ans=ans+"1 "for i in range(0,z_count):    ans=ans+"0 "print(ans)