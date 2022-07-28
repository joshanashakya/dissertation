n,a,b=input().split()arth = list(map(int,input().split()))alex = list(map(str,input().split()))ans=['2']*int(n)for i in arth:    ans[i-1]='1'print(" ".join(ans))
