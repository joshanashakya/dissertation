a= input()count4 = 0count7 = 0for i in a:    if i == '4':        count4+=1    if i=='7':        count7+=1 if count4 ==0 and count7 ==0:    print(-1)else:    if count4>=count7:        print(4)    else:        print(7)
