 length , min_bound , max_bound = map(int,input().split()) array = [1] val = 1 for each in range(1,min_bound):    val = val*2    array.append(val)for each in range(1,length +1 - min_bound):    array.append(1)    print(sum(array),end=" ") array = [1] val = 1 for each in range(1,max_bound):    val = val*2    array.append(val) for each in range(1,length +1 - max_bound):    array.append(val)  print(sum(array))