a,b = input().split("e")b = int(b)c,d = a.split(".")d += "0" * 200ans = c + d[:b] + "." + d[b:]while ans[-1] == "0":    ans = ans[:-1]if ans[-1] == ".":    ans = ans[:-1]print(ans)
