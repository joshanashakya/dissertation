a=[int(x) for x in input().split()]ans=0minimum=min(a[0],a[2],a[3])ans+=256*minimuma[0]-=minimuma[2]-=minimuma[3]-=minimumminimum=min(a[0],a[1])ans+=32*minimumprint(ans)
