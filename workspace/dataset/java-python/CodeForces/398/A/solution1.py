# Made By Mostafa_Khaled bot = True a,b=map(int,input().split())   def sqr(x):     return x*x   def work( num, flag=0 ):     ans=sqr(a-num+1)+num-1     could = min(b, num+1)       cc=b//could     res=b%could       ans-=res * sqr(cc+1) + (could-res)*sqr(cc)     if flag:         print(ans)         list=''           res2=could-res         if could==num+1:             list+='x'*cc             res2-=1           ta=a         list+='o'*(a-num+1)         ta-=a-num+1         while ta>0:             u=cc+int(res>0)             if res>0:                 res-=1             else:                 res2-=1             list+='x'*u             list+='o'             ta-=1         if res>0 or res2>0:             list+='x'*(cc+int(res>0))         print(str(list))     return ans   if a==0:     print(-sqr(b))     print('x'*b) elif b==0:     print(sqr(a))     print('o'*a) else:         now=1     for i in range(1,a+1):         if i-1<=b and work(i)>work(now):             now=i     work(now,1)   # Made By Mostafa_Khaled
