  f={'>':'1000', '<':'1001' , '+':'1010' , '-':'1011' , '.':'1100', ',':'1101' ,'[':'1110',']':'1111'}  t = input()u=''for j in t:    u+=f[j]print(int(u,2)%1000003)
