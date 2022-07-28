import mathfor i in range(int(input())):    a,b=map(int,input().split())    print("Finite") if(math.gcd(a,b)==1) else print("infinite")
