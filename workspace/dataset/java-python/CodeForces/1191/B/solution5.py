cards = list(map(str,input().split()))sArr = [0]*9mArr = [0]*9pArr = [0]*9 for i in cards:     val = int(i[0])     if i[1] == 's':            sArr[val-1] += 1     elif i[1] == 'm':         mArr[val-1] += 1     else:         pArr[val-1] += 1  maxNum = max(sArr,mArr,pArr)maxNum = max(maxNum)  if maxNum == 2:    print(1)elif maxNum == 3:    print(0)else:    trio = 0    for i in range(7):        trio = max(trio, sArr[i] + sArr[i+1] + sArr[i+2])     for i in range(7):        trio = max(trio, mArr[i] + mArr[i+1] + mArr[i+2])     for i in range(7):        trio = max(trio, pArr[i] + pArr[i+1] + pArr[i+2])     print(3-trio)            
