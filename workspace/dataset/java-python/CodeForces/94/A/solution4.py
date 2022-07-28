if __name__ == "__main__":
    st80 = input()
    st_10 = []
    dic = {}
    for i in range(10):
        el = input()
        st_10.append(el)
    for i in range(10):
        dic.setdefault(st_10[i], i)
    ans = ""
    parts = []
    for i in range(0, len(st80), 10):
        el = st80[i:i + 10]
        parts.append(el)
    for i in parts:
        ans = ans + str(dic[i])
    print(ans)
