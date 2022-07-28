st = input()maxChar = 'a'for char in st:    if maxChar < char:        maxChar = char print(maxChar * st.count(maxChar))
