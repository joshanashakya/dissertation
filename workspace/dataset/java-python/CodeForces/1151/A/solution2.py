def twd(ch, target): #two - way - difference    ref = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'*2    i,j = ref.index(ch),ref.index(target)    return min(abs(i - j),               ref[max(i,j):].index(min(ch,target)))        n = int(input())s = input()c = 0min_c = -1for i in range(0, n-3):    c = (twd(s[i],  'A')+         twd(s[i+1],'C')+         twd(s[i+2],'T')+         twd(s[i+3],'G'))        if ((min_c == -1) or (c < min_c)):        min_c = c        print(min_c)
