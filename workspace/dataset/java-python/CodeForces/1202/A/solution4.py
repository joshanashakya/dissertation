import sys def main():    for _ in range(int(sys.stdin.readline().strip())):        x=sys.stdin.readline().strip()        y=sys.stdin.readline().strip()        pos=0        for i in range(len(y)-1,-1,-1):            if y[i]=='1':                pos+=1                break            else:                pos+=1        count=0        for i in range(len(x)-pos,-1,-1):            if x[i]=='1':                break            else:                count+=1        print(count)                 main()
