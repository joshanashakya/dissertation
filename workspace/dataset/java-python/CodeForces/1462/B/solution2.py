t = int(input())
while t:    t -= 1
n = int(input())
st = input()
if st[0:1] == "2" and st[n - 3:] == "020" or st[0:2] == "20" and st[n - 2:] == "20" or st[0:3] == "202" and st[
                                                                                                            n - 1:] == "0" or st[
                                                                                                                              0:4] == "2020" or st[
                                                                                                                                                n - 4:] == "2020":
    print("YES")    else:
    print("NO")
