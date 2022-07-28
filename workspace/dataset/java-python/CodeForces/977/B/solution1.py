n = int(input())s = input()k=[s[i:i+2] for i in range(n-1)]print(max(k,key=k.count))
