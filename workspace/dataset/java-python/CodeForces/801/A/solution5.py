import sys arr = list(sys.stdin.readline().rstrip())st = []ans = 0idx = 0while idx < len(arr) - 1:    if arr[idx] + arr[idx + 1] == 'VK':        idx += 2        ans += 1    else:        st.append((arr[idx], idx))        idx += 1if idx == len(arr) - 1:    st.append((arr[idx], idx))can = Falsefor i in range(len(st) - 1):    if st[i][0] == st[i + 1][0]:        if abs(st[i][1] - st[i + 1][1]) == 1:            can = True            breakprint(ans + 1 if can else ans)
