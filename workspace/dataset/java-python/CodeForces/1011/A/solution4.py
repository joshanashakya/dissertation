stages,length = list(map(int,input().split())) s = list(input())s = list(set(s)) s.sort()weight = 0flag = 1next_stage = s[0]start = 0end = len(s) while length > 0:    length  -= 1    if (next_stage in s and flag==1):                weight += ord(next_stage)-96        flag=1                if(length>0):            for each in range(start,end):                flag=0                if(ord(s[each]) - ord(next_stage)>1):                    start=each                    flag=1                    next_stage = s[each]                    break    else:        flag=0        break         if(flag==1):    print(weight)else:    print(-1)