n = int(input())for i in range(n):    length = int(input())    content = [int(k) for k in input().split()]    anslist = [0]*length    poss = [1]*length    index = 0    fail = 0    for j in range(length):        if j == 0:            anslist[j] = content[j]            poss[content[j]-1] = 0        elif j != 0 and content[j] > content[j-1]:            anslist[j] = content[j]            poss[content[j]-1] = 0        else:            while poss[index] == 0:                index += 1                if index == length:                    break            if index < length and index+1 <= content[j]:                anslist[j] = index+1                poss[index] = 0            else:                fail = 1                break        #print (anslist, poss)    if fail == 1:        print ("-1")    else:        strlist = [str(x) for x in anslist]        print (" ".join(strlist))                                        
