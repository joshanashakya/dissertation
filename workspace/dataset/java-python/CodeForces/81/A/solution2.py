s = input() length = len(s)
ans = []
ans.append(s[0]) for i in range(1, length):    length1 = len(
    ans)  # print(ans,length)    if length1>0 and s[i]==ans[-1] :        ans.pop()    else :        ans.append(s[i])        print("".join(ans))
