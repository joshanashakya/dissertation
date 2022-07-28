n,w=map(int,input().split())a=list(map(int,input().split()))a.sort()g=a[0]b=a[n]if (g*2)<=b:    b=(g*2)elif (g*2)>b:    g=b/2ans=(g*n)+(b*n)if ans>w:    ans=wprint(ans)
