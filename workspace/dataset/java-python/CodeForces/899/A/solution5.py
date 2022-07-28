n=int(input())arr=list(map(int,input().split()))ris=0num2=arr.count(2)num1=arr.count(1)if num1>=num2:    ris+=num2    num1-=num2    ris+=num1//3elif num1<=num2 and 1 in arr:    ris+=num1print(ris)
