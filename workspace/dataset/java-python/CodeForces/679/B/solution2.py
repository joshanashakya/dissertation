B = (0,0)def solve(rem , step , sub):    global B    if rem == 0 :        B = max(B , (step , sub))        return    cnt = 1    while((cnt+1)**3 <= rem): cnt+=1    solve(rem-cnt**3,step+1 , sub + cnt**3)    if(cnt>0):        solve(cnt**3 - 1 - (cnt-1)**3 , step+1 , sub+ (cnt-1)**3)  x = int(input())solve(x,0,0)print(B[0],B[1])