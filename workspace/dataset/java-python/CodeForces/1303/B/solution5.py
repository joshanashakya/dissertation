for _ in" "*int(input()):n,g,b=map(int,input().split());print(max(n,(((n+1)//2)//g)*(g+b)+((n+1)//2)-((((n+1)//2)//g)*g)if((n+1)//2)-((((n+1)//2)//g)*g)else(((n+1)//2)//g)*(g+b)-b))
