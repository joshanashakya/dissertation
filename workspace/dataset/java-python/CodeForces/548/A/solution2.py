#Author : Zahin uddin#Github : https://github.com/Zahin52  from sys import *#import math#import queueinput=stdin.readlinelistInput=lambda:list(map(int,input().strip().split()))lineInput= lambda:map(int,input().strip().split())# sJoin=lambda a,sep : f'{sep}'.join(a)# arrJoin=lambda a,sep : f'{sep}'.join(map(str,a))#print=stdout.writedef isPrime(n):    if(n <= 1):        return False    if(n <= 3):        return True    if(n % 2 == 0 or n % 3 == 0):        return False    for i in range(5,int(math.sqrt(n) + 1), 6):        if(n % i == 0 or n % (i + 2) == 0):            return False    return Truedef main():    s=input().strip()    k=int(input())    length=len(s)    each=length//k       flag=True    if length%k!=0:        print("NO")    else:        for i in range(0,length,each):            #print(i,each,s[i:i+each],s[i:i+each][::-1])            if s[i:i+each]!=s[i:i+each][::-1]:                flag=False                break        print ("YES" if flag else "NO")if __name__ == "__main__":    main()
