st = input()nn = st.count('n')ne = st.count('e')ni = st.count('i')nt = st.count('t') ans = min((nn - 1) // 2, ne // 3, ni, nt)print(max(ans, 0))
