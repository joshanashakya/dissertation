k = int(input()) a = [1 , 0 , 0 , 0 , 1 , 0 , 1 , 0 , 2 , 1] if(k > 36): print(-1)elif(k==1): print(6)else:     print('8'*(k//2),end="")     if(k % 2):         print("0")
