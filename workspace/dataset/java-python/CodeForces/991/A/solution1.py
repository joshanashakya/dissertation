#Author : Zahin uddin#Github : https://github.com/Zahin52  from sys import *#import math#import queueinput=stdin.readlinelistInput=lambda:list(map(int,input().strip().split()))lineInput= lambda:map(int,input().strip().split())sJoin=lambda a,sep : f'{sep}'.join(a)arrJoin=lambda a,sep : f'{sep}'.join(map(str,a))#print=stdout.writedef isPrime(n):    if(n <= 1):        return False    if(n <= 3):        return True    if(n % 2 == 0 or n % 3 == 0):        return False    for i in range(5,int(math.sqrt(n) + 1), 6):        if(n % i == 0 or n % (i + 2) == 0):            return False    return Truedef main():    a,b,c,n=lineInput()    # exactA=a-c    # exactB=b-c    check=a+b-c    print(n-check if n-check>0 and (a>=c and b>=c) else -1)    if __name__ == "__main__":    main()