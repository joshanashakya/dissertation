list1=[]str1=input()list2=str1.split(" ")list2_length=len(list2)i=0while i<=list2_length-1:    list1.append(int(list2.pop()))    i+=1list1.reverse()x=list1[0]t=list1[1]a=list1[2]b=list1[3]da=list1[4]db=list1[5]pan=0for n in range(0,t):    for m in range(0,t):        if x==0 or m*da==a-x or m*db==b-x or n*da+m*db==a+b-x:            print("YES")            pan=1            break    if pan==1:        breakif pan==0:    print("NO")
