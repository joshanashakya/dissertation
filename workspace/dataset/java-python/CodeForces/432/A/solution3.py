s = input().split(' ')n = int(s[0])k = int(s[1])s = input().split(' ')l = len(s)count = 0for i in range(l):    if(k + int(s[i]) <= 5):        count = count+1 print(int(count/3))
