MOD = int(1e9)+7 def solve():   s = input()   r=c=0   for i in range(len(s)-1, -1, -1):      if s[i] == 'b': c+=1      else:         r+=c         c= (c*2)%MOD    return r%MOD print(solve())
