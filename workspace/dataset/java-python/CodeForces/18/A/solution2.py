####################################################################                  ."-,.__#                  `.     `.  ,#               .--'  .._,'"-' `.#              .    .'         `'#              `.   /          ,'#                `  '--.   ,-"'#                 `"`   |  \#                    -. \, |#                     `--Y.'      ___.#                          \     L._, \#                _.,        `.   <  <\                _#              ,' '           `, `.   | \            ( `#           ../, `.            `  |    .\`.           \ \_#          ,' ,..  .           _.,'    ||\l            )  '".#         , ,'   \           ,'.-.`-._,'  |           .  _._`.#       ,' /      \ \        `' ' `--/   | \          / /   ..\#     .'  /        \ .         |\__ - _ ,'` `        / /     `.`.#     |  '          ..         `-...-"  |  `-'      / /        . `.#     | /           |L__           |    |          / /          `. `.#    , /            .   .          |    |         / /             ` `#   / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \#  / .           \"`_/. `-_ \_,.  ,'    +-' `-'  _,        ..,-.    \`.# .  '         .-f    ,'   `    '.       \__.---'     _   .'   '     \ \# ' /          `.'    l     .' /          \..      ,_|/   `.  ,'`     L`# |'      _.-""` `.    \ _,'  `            \ `.___`.'"`-.  , |   |    | \# ||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|# ||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||# || '              V      / /           `   | `   ,'   ,' '.    !  `. ||# ||/            _,-------7 '              . |  `-'    l         /    `||# . |          ,' .-   ,' ||               | .-.        `.      .'     ||#  `'        ,'    `".'    |               |    `.        '. -.'       `'#           /      ,'      |               |,'    \-.._,.'/'#           .     /        .               .       \    .''#         .`.    |         `.             /         :_,'.'#           \ `...\   _     ,'-.        .'         /_.-'#            `-.__ `,  `'   .  _.>----''.  _  __  /#                 .'        /"'          |  "'   '_#                /_|.-'\ ,".             '.'`__'-( \#                  / ,"'"\,'               `/  `-.|" ################################################################### from sys import stdin, stdoutfrom math import floor, gcd, fabs, factorial, fmod, sqrt, inf, logfrom collections import defaultdict as dd, dequefrom heapq import merge, heapify, heappop, heappush, nsmallestfrom bisect import bisect_left as bl, bisect_right as br, bisect        mod = pow(10, 9) + 7mod2 = 998244353        def inp(): return stdin.readline().strip()def iinp(): return int(inp())def out(var, end="\n"): stdout.write(str(var)+"\n")def outa(*var, end="\n"): stdout.write(' '.join(map(str, var)) + end)def lmp(): return list(mp())def mp(): return map(int, inp().split())def smp(): return map(str, inp().split())def l1d(n, val=0): return [val for i in range(n)]def l2d(n, m, val=0): return [l1d(m, val) for j in range(n)]def remadd(x, y): return 1 if x%y else 0def ceil(a,b): return (a+b-1)//b  def isprime(x):    if x<=1: return False    if x in (2, 3): return True    if x%2 == 0: return False    for i in range(3, int(sqrt(x))+1, 2):        if x%i == 0: return False    return True def chk(l):    a = (l[0]-l[2])**2+(l[1]-l[3])**2    b = (l[4]-l[2])**2+(l[3]-l[5])**2    c = (l[0]-l[4])**2+(l[1]-l[5])**2    ml = [a, b, c]    ml.sort()    return ml[0]+ml[1]==ml[2] and all(ml) l = lmp()if chk(l):    print("RIGHT")else:    flg=False    for i in range(3):        for j in range(4):            jx = [0, 1, 0, -1]            jy = [1, 0, -1, 0]            k = l.copy()            k[2*i] += jx[j]            k[2*i+1] += jy[j]            if(chk(k)):                flg = True                break        if flg: break    print("ALMOST" if flg else "NEITHER")