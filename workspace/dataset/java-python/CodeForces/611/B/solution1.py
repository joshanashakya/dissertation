#Author : Zahin uddin#Github : https://github.com/Zahin52  from sys import *import math#import queueinput=stdin.readlinelistInput=lambda:list(map(int,input().strip().split()))lineInput= lambda:map(int,input().strip().split())sJoin=lambda a,sep : f'{sep}'.join(a)arrJoin=lambda a,sep : f'{sep}'.join(map(str,a))#print=stdout.writedef isPrime(n):    if(n <= 1):        return False    if(n <= 3):        return True    if(n % 2 == 0 or n % 3 == 0):        return False    for i in range(5,int(math.sqrt(n) + 1), 6):        if(n % i == 0 or n % (i + 2) == 0):            return False    return Truedef main():    a,b=lineInput()    low=int(math.log2(a))    high=int(math.log2(b))    bin_a=bin(a)[2:]    bin_b=bin(b)[2:]    mini=min(len(bin_a),len(bin_b))    maxi=max(len(bin_a),len(bin_b))    minbit=["1"]*mini    maxibit=["1"]*maxi    c=0    # print(low , high)    #print(mini,maxi,"\n",maxibit,minbit)    for i in range(1,mini):                temp=minbit.copy()        #print(minbit)        temp[i]="0"        #print(temp)        #print(int(("".join(temp)),2),b)        if int(("".join(temp)),2)>b:            break        elif a<=int(("".join(temp)),2)<=b:            c+=1    #print(c)    if mini<maxi:        for i in range(1,maxi):            temp=maxibit.copy()            temp[i]="0"            #print(int(("".join(temp)),2))            if int(("".join(temp)),2)>b:                break            else:                c+=1    #print(c)                dif=maxi-mini    #print(dif,mini,maxi)    if dif>1:        #print((dif-1),((mini+dif)))        c+=((dif-1)*(mini+(maxi-2)))//2                                    print(c)if __name__ == "__main__":    main()
