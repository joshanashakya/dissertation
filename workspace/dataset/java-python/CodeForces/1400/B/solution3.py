import sys# sys.stdin = open("input.txt") def main():    tn = int(input())    for ti in range(tn):        p, f = map(int, input().split())        cs, cw = map(int, input().split())        s, w = map(int, input().split())        if s < w:            s, w = w, s            cs, cw = cw, cs        ans = 0        for ps in range(cs + 1):            if ps * s > p:                break            pw = min((p - ps * s) // w, cw)            fw = min(f // w, cw - pw)            fs = min((f - fw * w) // s, cs - ps)            ans = max(ans, ps + pw + fs + fw)        print(ans)  if __name__ == "__main__":    main()
