import mathno_of_dancers, cost_of_white, cost_of_black = map(int,input().split())costume = list(map(int,input().split())) cost = 0flag = 1 for i in range(0,math.ceil(no_of_dancers/2)):    flag = 0     if(costume[i] ==2 or  costume[-i-1]== 2):        flag=1        if(costume[i] == 2 and costume[-i-1] == 2):            cost += 2*min(cost_of_black,cost_of_white)             if(i == math.floor(no_of_dancers/2)):                cost -= min(cost_of_black,cost_of_white)         elif(costume[i] == 2 and costume[-i-1]!=2):            if(costume[-i-1] == 1):                cost += cost_of_black             else:                cost += cost_of_white         elif(costume[i]!=2 and costume[-i-1]==2):            if(costume[i] == 1):                cost += cost_of_black             else:                cost += cost_of_white     elif(costume[i] == costume[-i-1]):        flag=1        pass    else:        break           if(flag == 0):    print(-1)else:    print(cost)  