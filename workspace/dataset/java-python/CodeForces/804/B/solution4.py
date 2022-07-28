a = input()mod = 1000000007ans = 0count_a = 0for i in a:    if i=='a':        count_a+=1    else:        ans+= (pow(2,count_a,mod)-1)%modprint(ans%mod)
