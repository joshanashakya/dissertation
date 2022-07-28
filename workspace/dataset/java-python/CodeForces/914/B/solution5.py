n=int(input())a=list(map(int,input().split()))l1=[0]*100001for item in a: l1[item]+=1ans="Agasa"for item in l1:    if item%2: ans="Conan"; breakprint(ans)
