'''def userName(username):    if len(username) < 1 or len(username) > 16:        return -1    for item in username:        if item < '0' or item > 'w' and item != '_':            return -1    return 1  def hostName(hostname):    if len(hostname) < 1 or len(hostname) > 32:        return -1    for item in hostname:    line = input()indOfAt = line.index('@')username = line[0:indOfAt]hostname = line[indOfAt + 1:line.rindex('.')]'''  def check(line):    ln = len(line)    if ln == 0 or ln > 16:        return False    for it in line:        if not ('A' <= it <= 'Z' or                'a' <= it <= 'z' or                '0' <= it <= '9' or                it == '_'):            return False    return True  def checkHost(hostName):    ln = len(hostName)    if ln == 0 or ln > 32:        return False    for token in hostName.split('.'):        if not check(token):            return False    return True  mail, isUser, isHost, isRes = input(), False, False, Falseif '@' in mail:    atIndex = mail.index('@')    userName = mail[:atIndex]    isUser = check(userName)    hostName = mail[atIndex + 1: mail.index('/')] if '/' in mail else mail[atIndex + 1:]    isHost = checkHost(hostName)    if '/' not in mail:        isRes = True    else:        isRes = check(mail[mail.index('/') + 1:]) print('YES' if isUser and isHost and isRes else 'NO')