if __name__=="__main__":    for _ in range(int(input())):        s=input()        t=input()        li=list(s)        for i in li:            if i in t:                print("YES")                break        else:            print("NO")
