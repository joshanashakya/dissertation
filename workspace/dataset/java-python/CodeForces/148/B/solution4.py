import sysimport mathimport collectionsimport bisectdef get_ints(): return map(int, sys.stdin.readline().strip().split())def get_list(): return list(map(int, sys.stdin.readline().strip().split()))def get_string(): return sys.stdin.readline().strip()princess=int(input())dragon=int(input())t=int(input())f=int(input())c=int(input())start=t*princesscount=0if dragon<=princess:    print(0)    quit()while start<c:    d1=start+(princess)    d2=dragon    time=start/(dragon-princess)    start+=princess*time    if start<c:        count+=1        start+=princess*(time+f)print(count)
