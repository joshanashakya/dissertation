# A. Sum of Odd Integerst=int(input())for i in range(t):    n,k=map(int,input().split())    if (n%2!=k%2) or pow(k,2)>n :        print("NO")    else:        print("YES")
