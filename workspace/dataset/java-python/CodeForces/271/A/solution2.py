year=input('')while True:    year= str(int(year)+1)    nums=[]    for y in year:        if y not in nums:            nums.append(y)    if len(nums)==4:        print(year)        break
