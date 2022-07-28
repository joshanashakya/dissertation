n = int(input())c = list(map(int,input().split()))import mathfor i in c:    print(int(i*4/math.gcd(i*4,i+1))+1)
