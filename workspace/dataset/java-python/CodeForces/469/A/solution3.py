n=int(input())x=list(map(int,input().split()))y=list(map(int,input().split()))l=x[1:]+y[1:]l=set(l)if len(l)==n:    print("I become the guy.")else:    print("Oh, my keyboard!")
