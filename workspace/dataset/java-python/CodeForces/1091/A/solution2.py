 a,b,c=map(int,input().split())res=0if b>=a+1 and c>=a+2:    res=max(res,(a*3)+3)if a>=b-1 and c>=b+1:    res=max(res, b*3)if a>=c-2 and b>=c-1:    res=max(res,(c*3)-3)print(res)
