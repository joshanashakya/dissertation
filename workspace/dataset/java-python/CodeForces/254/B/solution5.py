def day(m,d):    days=0    for i in range(1,m):        if i in [1,3,5,7,8,10,12]:days+=31        elif i==2:days+=28        else:days+=30    days+=d+100    return daysstdin = open('input.txt','r')f = open("output.txt", 'w')days=[0]*565n=int(stdin.readline().strip())for _ in range(n):    print("sdfds")    m,d,p,t=map(int,stdin.readline().split())    day_num=day(m,d)        #print(day_num)       for i in range(day_num,day_num-t,-1):        days[i]+=pf.write(str(max(days)))