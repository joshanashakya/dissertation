input()c=[int(x)for x in input().split()]l=c.pop(0)c.sort(reverse=True)ans=0while l<=c[0]:    ans+=1    l+=1    c[0]-=1    c.sort(reverse=True)print(ans) 
