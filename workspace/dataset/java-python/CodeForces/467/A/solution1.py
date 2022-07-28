rooms= int(input(''))count=0for room in range(rooms):    x= input('').split()    if int(x[1])-int(x[0])>=2:        count+=1print(count)
