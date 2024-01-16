import re

def solution(myString, pat):
    answer = 0
    pattern = re.compile(pat, re.IGNORECASE)
    match_string = re.search(pattern, myString)    
    if match_string is not None:
        answer = 1 

    
    return answer