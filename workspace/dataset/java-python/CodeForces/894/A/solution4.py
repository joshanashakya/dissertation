s = input()n= len(s)count=0for i in range(0,n):    if(s[i]=="Q"):        for j in range(i,n):            if(s[j]=="A"):                for k in range(j,n):                    if(s[k]=="Q"):                        count+=1                        print(count)    
