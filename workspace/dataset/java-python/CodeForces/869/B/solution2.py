'''http://codeforces.com/contest/869/problem/B'''a,b = map(int,input().split()) if a > b or b-a>10:    print(0)elif a == b:    print(1)else:    fact = 1    for i in range(a+1,b+1):        fact = (fact*(i%10))%10    print(fact)     
