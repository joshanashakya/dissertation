# cook your dish hereimport math  types_of_peeble , pocket_size = map(int,input().split())pebble_array = list(map(int,input().split()))i = pocket = 0 while types_of_peeble > 0 :    pebble = pebble_array[i]    if(pebble <= pocket_size):        pocket += 1    elif(pebble > pocket_size and pebble <= 2*pocket_size):        pocket += 2     else:        pocket += pebble // pocket_size         pebble = pebble % pocket_size         if(pebble==0):            pass        else:            pocket += 1      types_of_peeble -= 1     i += 1    print(math.ceil(pocket/2))    
