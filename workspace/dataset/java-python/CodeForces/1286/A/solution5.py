a=int(input())z=list(map(int,input().split()))import math odd=0eve=0for i in range(len(z)):    if(z[i]%2==1):        odd+=1    elif(z[i]%2==0 and z[i]>0):        eve+=1 odd=(a//2)+(a%2)-oddeve=(a//2)-eve+((a%2))cnt=0 dp=[[[math.inf for i in range(2)] for i in range(odd+2)] for i in range(len(z))] #dp[i][j][t]  = i denote index , j denote , odd number 0 denote the last index is odd or 1 if it is even  for i in range(len(z)):    if(i==0 and z[i]==0):        cnt+=1        dp[i][1][0]=0        dp[i][0][1]=0        continue;    elif(i==0 and z[i]!=0):        dp[i][0][1-(z[i]%2)]=0                continue;        if(z[i]!=0):                if(z[i-1]!=0):                                                for j in range(min(cnt+1,odd+1)):                dp[i][j][1-(z[i]%2)]=dp[i-1][j][1-((z[i-1])%2)]+int(z[i]%2!=z[i-1]%2)        else:            for j in range(min(cnt+1,odd+1)):                                dp[i][j][1-(z[i]%2)]=min(dp[i-1][j][1-(z[i]%2)],dp[i-1][j][z[i]%2]+1)                    else:        cnt+=1                for j in range(min(cnt+1,odd+1)):            if(j==0):                dp[i][j][1]=min(dp[i-1][j][0]+1,dp[i-1][j][1])                            else:                                dp[i][j][0]=min(dp[i-1][j-1][0],dp[i-1][j-1][1]+1)                dp[i][j][1]=min(dp[i-1][j][1],dp[i-1][j][0]+1)                                    mini=math.inf   mini=min(dp[len(z)-1][odd][0],dp[len(z)-1][odd][1])print(mini)                                                         