import re s = input().strip()s = re.sub('\s+', ' ', s)s = re.sub('\s?([.,!?])\s?', '\\1 ', s)print(s)
