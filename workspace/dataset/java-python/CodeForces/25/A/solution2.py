n=int(input())odd = 0even = 0oddNum = 0evenNum = 0a=input()item = a.split(" ")testi = [eval(x) for x in item]for i in range(0,n):    if testi[i] % 2 == 0:        even+=1        evenNum = i+1    else:        odd+=1        oddNum = i+1if odd == 1:    print(oddNum)if even == 1:    print(evenNum)        