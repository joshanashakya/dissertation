n=int(input())a=[int(j) for j in input().split()]a.sort()one,two,three=0,0,0for i in a:    if i==1:        one=one+1    elif i==2:        two=two+1    elif i==3:        three=three+1print(n-max(one,two,three))