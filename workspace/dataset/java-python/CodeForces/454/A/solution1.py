def romb(n):    final_list = []    m_l = []    for i in range(n):        m_l.append("*")    mid = len(m_l) // 2    reached_first = False    k = 0    for i in range(n):        if len(m_l) - 1 >= i + mid and not reached_first:            m_l[i + mid] = "D"            m_l[mid - i] = "D"            final_list.append("".join(m_l))        if len(m_l) - 1 < i + mid:            reached_first = True        if reached_first:            m_l[-1 - k] = "*"            m_l[0 + k] = "*"            k += 1            final_list.append("".join(m_l))    return "\n".join(final_list)  def main_function():    n = int(input())    return romb(n) print(main_function())