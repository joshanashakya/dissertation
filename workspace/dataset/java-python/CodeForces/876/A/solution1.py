no_of_meals = int(input()) ro = int(input()) re = int(input()) oe = int(input()) distance = 0home = "r" for each in range(0,no_of_meals-1):    if(home=="r"):        if(ro > re):            home = "e"            distance += re         else:            home = "o"             distance += ro                elif(home=="o"):        if(ro > oe):            home = "e"            distance += oe         else:            home = "r"             distance += ro                else:        if(re > oe):            home = "o"            distance += oe         else:            home = "r"             distance += re             print(distance)  
